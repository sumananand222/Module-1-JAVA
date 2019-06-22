package cg;
import java.util.*;
import java.io.*;
import com.cg.service.*;

import com.cg.bean.*;
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Long,Account> accmap= new TreeMap<Long, Account>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ch="";
		while(true) {
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1 Create new Account");
		System.out.println("2 Print all accounts");
		System.out.println("3 Exit");
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
					
					/*
					 //Accepting and validating input for account holder
					  * not allowed:  space on first index, single character, $, _, numbers
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
					 
					  balance should be minimum 0.0
					  
					 * */
					System.out.println("Enter account holder");
					ah=br.readLine();//account holder
					System.out.println("Enter balance");
					String s_bal=br.readLine();// balance
					bal=Double.parseDouble(s_bal);
					Account ob = new Account(id, mb, ah, bal);
					accmap.put(ob.getMobile(), ob);
			break;
		case "2" :
					Collection<Account> vc=accmap.values();
					List<Account> acclist=new ArrayList<Account>(vc);
					Collections.sort(acclist);
					for(Account o: acclist) {
						System.out.println(o);
						//service.printStatement(o);
						
					}
			break;
		case "3" : 	System.out.println("Exiting Program");
					System.exit(0);
			break;
		default :
			System.out.println("Invalid choice.");
		
		}
		}//end of menu
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Account ob1=new Account(110,234567,"Ram",25000.00);
		//accmap.put(ob1.getMobile(),ob1);
		//Account ob2=new Account(102,234578,"Sham",55000.00);
		//accmap.put(ob2.getMobile(),ob2);
		//Account ob3=new Account(103,234576,"Abdul",15000.00);
		//accmap.put(ob3.getMobile(),ob3);
		//Account ob4=new Account(104,234577,"Ganesh",45000.00);
		//accmap.put(ob4.getMobile(),ob4);
/*		System.out.println(accmap);
		System.out.println(accmap.keySet());
		System.out.println("------------------------------------");
		Collection<Account> vc=accmap.values();
		List<Account> acclist=new ArrayList<Account>(vc);
		Collections.sort(acclist);
		for(Account o: acclist) {
			System.out.println(o);
		}
		System.out.println("============================================================ sort by name");
		Comparator nc=new NameComparator();
		Collections.sort(acclist,nc);
		for(Account o: acclist) {
		System.out.println(o);
		}
		System.out.println("============================================================ sort by balance");
		Comparator bc=new BalanceComparator();
		Collections.sort(acclist,bc);
		for(Account o: acclist) {
		System.out.println(o);
		}
	*/	
/*		Set<Account> aset=new TreeSet<Account>();
 * 		aset.add(Account object);
 * 		aset.add(Account object);
 * 
		//sort by name then
		Comparator nc = new NameComparator();
		Set<Account> aset= new TreeSet<Account>();
		aset.add(Account object); // invoke CompareTo method // for that its constructor should be empty
		aset.add(Account object);
*/
	}
}
