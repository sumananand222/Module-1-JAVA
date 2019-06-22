package com.cg.pl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;
import com.cg.bean.*;
import com.cg.exception.InsufficientFundException;
import com.cg.service.AccountService;
import com.cg.service.Gst;
import com.cg.service.Validator;
public class Demo6 {

	public static void main(String[] args) throws IOException {
		AccountService service = new AccountService();
		
		Map<Long,Account> accmap= new TreeMap<Long, Account>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ch="";
		while(true) {
		System.out.println("Menu");
		System.out.println("====================");
		System.out.println("1 Create new Account");
		System.out.println("2 Delete Account");
		System.out.println("3 Update Account");
		System.out.println("4 Withdraw Amount");
		System.out.println("5 Deposit Amount");
		System.out.println("6 Transfer Amount");
		System.out.println("7 Find Account");
		System.out.println("8 Print all accounts");
		System.out.println("9 Exit");
		System.out.println("Enter your choice:");
		ch=br.readLine();
		switch(ch)
		{
		case "1" : 	int id=0;
					long mb=0L;
					String ah = "";
					double bal=0.0;
					//Accepting and validating input for account number
					System.out.println("Enter account number");
					while(true) {
						String s_id=br.readLine();
						boolean ch1=Validator.validatedata(s_id,Validator.aidpattern);
						if(ch1==true) {
							try {
								id=Integer.parseInt(s_id);
								break;
							}
							catch(NumberFormatException e) {
								System.out.println("Account number must be numeric. Re-enter.");
							}
						}
						else {
							System.out.println("Re-enter Account Number in 3 digits.");
						}
					}//end of account number while
					
					//Accepting and validating input for mobile number
					System.out.println("Enter mobile number");
					while(true) {
						String s_mb=br.readLine();
						boolean ch1=Validator.validatedata(s_mb,Validator.mobilepattern);
						if(ch1==true) {
							try {
								mb=Long.parseLong(s_mb);
								break;
							}
							catch(NumberFormatException e) {
								System.out.println("Mobile number must be numeric. Re-enter.");
							}
						}
						else {
							System.out.println("Re-enter Mobile Number in 10 digits.");
						}
					}//end of mobile number while
					
					 //Accepting and validating input for account holder
					 // * not allowed:  space on first index, single character, $, _, numbers
					System.out.println("Enter account holder");
					while(true) {
						//String s_id=br.readLine();
						ah=br.readLine();//account holder

						boolean ch1=Validator.validatedata(ah,Validator.namepattern);
						if(ch1==true) {
								break;
						}
						else {
							System.out.println("Re-enter Account Holder Name using alphabets.");
						}
					}//end of account holder name while
					
					 //Accepting and validating input for account balance
					System.out.println("Enter balance");
					while(true) {
						String s_bal=br.readLine();// balance
	
						boolean ch1=Validator.validatedata(s_bal,Validator.balpattern);
						if(ch1==true) {
							bal=Double.parseDouble(s_bal);
								break;
						}
						else {
							System.out.println("Re-enter Balance in digits.");
						}
					}//end of account balance while
					
					/*
					 //Accepting and validating input for account balance
					System.out.println("Enter balance");
					while(true) {
						String s_bal=br.readLine();// balance
	
						boolean ch1=Validator.validatedata(s_bal,Validator.aidpattern);
						if(ch1==true) {
							bal=Double.parseDouble(s_bal);
								break;
						}
						else {
							System.out.println("Re-enter Balance in digits.");
						}
					}//end of account balance while
					 
					  balance should be minimum 0.0
					  
					 * */
				//	System.out.println("Enter account holder");
					//ah=br.readLine();//account holder
//					System.out.println("Enter balance");
				//	String s_bal=br.readLine();// balance
					//bal=Double.parseDouble(s_bal);
					Account ob = new Account(id, mb, ah, bal);
					boolean b = service.addAccount(ob);
					accmap.put(ob.getMobile(), ob);
					System.out.println("Successfully Added!");
			break;
		case "2" : System.out.println("Delete Account");
				
			break;
		case "3" :	System.out.println("Update Account");
					System.out.println("Enter mobile no:");
					int u_mb=Integer.parseInt(br.readLine());
					System.out.println("Enter account number");
					while(true) {
						String s_id=br.readLine();
						boolean ch1=Validator.validatedata(s_id,Validator.aidpattern);
						if(ch1==true) {
							try {
								id=Integer.parseInt(s_id);
								break;
							}
							catch(NumberFormatException e) {
								System.out.println("Account number must be numeric. Re-enter.");
							}
						}
						else {
							System.out.println("Re-enter Account Number in 3 digits.");
						}
					}//end of account number while
					
					 //Accepting and validating input for account holder
					 // * not allowed:  space on first index, single character, $, _, numbers
					System.out.println("Enter account holder");
					while(true) {
						//String s_id=br.readLine();
						ah=br.readLine();//account holder

						boolean ch1=Validator.validatedata(ah,Validator.namepattern);
						if(ch1==true) {
								break;
						}
						else {
							System.out.println("Re-enter Account Holder Name using alphabets.");
						}
					}//end of account holder name while
					
					 //Accepting and validating input for account balance
					System.out.println("Enter balance");
					while(true) {
						String s_bal=br.readLine();// balance
	
						boolean ch1=Validator.validatedata(s_bal,Validator.balpattern);
						if(ch1==true) {
							bal=Double.parseDouble(s_bal);
								break;
						}
						else {
							System.out.println("Re-enter Balance in digits.");
						}
					}//end of account balance while
					Account ob1 = new Account(id, u_mb, ah, bal);
					boolean b = service.updateAccount(ob1);
					//accmap.put(ob1.getMobile(), ob1);
					
					
			break;
		case "4" : 	System.out.println("To Withdraw amount, Enter Account no:");
					int w_id=Integer.parseInt(br.readLine());
					System.out.println();
			break;
		case "5" :
			break;
		case "6" :
			break;
		case "7" : 	System.out.println("Find Account");
					System.out.println("Enter Mobile no:");
					long mob=Long.parseLong(br.readLine());
					service.findAccount(mob);
			break;
		case "8" :
					Collection<Account> vc=accmap.values();
					List<Account> acclist=new ArrayList<Account>(vc);
					//Collections.sort(acclist);
					for(Account o: acclist) {
						//System.out.println(o);
						service.printStatement(o);
						
					}
			break;
		case "9" : 	System.out.println("Exiting Program");
					System.exit(0);
			break;
		default :
			System.out.println("Invalid choice.");
		
		}
		}//end of menu
	
		
	}

}