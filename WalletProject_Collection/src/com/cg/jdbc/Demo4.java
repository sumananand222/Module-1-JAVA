//insert command execution

package com.cg.jdbc;

import java.sql.*;
import java.util.Scanner;
//import com.cg.dao.*;
import com.cg.bean.*;
public class Demo4 {

	public void insertAccount(Account ob){
		// TODO Auto-generated method stub
		try {
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:xe"; String user="hr"; String pass="hr";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			con.setAutoCommit(false); // tells that do not commit after every dml statement
			Scanner sc = new Scanner(System.in);
			/*
			 * System.out.println("Enter Account ID:");
			int id = sc.nextInt();
			System.out.println("Enter Mobile No:");
			long mb=sc.nextLong();
			System.out.println("Enter Account Holder Name:");
			String ah=sc.next();
			System.out.println("Enter Initial Balance:");
			double bal=sc.nextDouble();*/
			//dynamic query
			String sqlQuery="Insert into account values(?,?,?,?)";
			
			PreparedStatement st=con.prepareStatement(sqlQuery);
			st.setInt(1, ob.getAid());
			st.setLong(2, ob.getMobile());
			st.setString(3, ob.getAccountholder());
			st.setDouble(4, ob.getBalance());
			
			int insertedRec =st.executeUpdate();
			System.out.println("Inserted Records "+insertedRec);
			
			con.commit();
			con.close();
			sc.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage()+" "+e.getErrorCode()+" "+e.getSQLState());
			e.printStackTrace();
		}
			
	}

}


