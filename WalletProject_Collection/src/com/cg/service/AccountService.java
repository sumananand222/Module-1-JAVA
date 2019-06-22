package com.cg.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.cg.bean.Account;
import com.cg.dao.AccountDAO;
import com.cg.dao.AccountDAOImpl;
//import com.cg.jdbc.Demo4;
//import com.cg.jdbc.*;
public class AccountService extends Demo4 implements Gst, Transaction {

	AccountDAO dao=new AccountDAOImpl();
	Demo4 d = new Demo4();
	@Override
	public double withdraw(Account ob, double amount) {
		double new_balance=ob.getBalance()-amount;
		if(new_balance<1000.00) {
			new_balance=ob.getBalance();
			System.out.println("Insufficient Balance");
		}
		ob.setBalance(new_balance);
		return new_balance;
	}

	@Override
	public double deposit(Account ob, double amount) {
		// TODO Auto-generated method stub
		double new_balance=ob.getBalance()+amount;
		ob.setBalance(new_balance);
		return new_balance;
	}


	public boolean addAccount(Account ob) {
		//d.insertAccount(ob);
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Step 2");
			
		
		System.out.println("Step 1");
		
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:xe"; String user="hr"; String pass="hr";
		System.out.println("Step 2");
		
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connected");
		String sqlQuery="Insert into account values(?,?,?,?)";
		int id = ob.getAid();
		long mb=ob.getMobile();
		String ah=ob.getAccountholder();
		double bal=ob.getBalance();
			PreparedStatement st=con.prepareStatement(sqlQuery);
			st.setInt(1, id);
			st.setLong(2, mb);
			st.setString(3, ah);
			st.setDouble(4, bal);
			
			int insertedRec =st.executeUpdate();
			System.out.println("Inserted Records "+insertedRec);
			
			con.commit();
			con.close();
			//sc.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage()+" "+e.getErrorCode()+" "+e.getSQLState());
			e.printStackTrace();
		}
		
		return true;
	}
	public boolean updateAccount(Account ob) {
		return dao.updateAccount(ob);
	}
	public boolean deleteAccount(Account ob) {
		return dao.deleteAccount(ob);
	}
	public Account findAccount(Long mobileno) {
		return dao.findAccount(mobileno);
	}
	public Map<Long, Account> getAllAccounts(){
		return dao.getAllAccounts();
	}

	@Override
	public double transferMoney(Account from, Account to, double amount) {
		// TODO Auto-generated method stub
		withdraw(from, amount);
		deposit(to,amount);
		dao.transferMoney(from, to);
		return 1;
	}

	@Override
	public double calculateTax(double PCT, double amount) {
		// TODO Auto-generated method stub
		return PCT*amount;
	}


}