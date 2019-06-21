//Using account ID fetch balance

package cg;
import java.sql.*;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement updateSt=null;
		PreparedStatement selectSt=null;
		try {
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
			// in java 8 it automatically loads the driver, therefore no need to write DriverManager or Class.forName
			String url="jdbc:oracle:thin:@localhost:1521:xe"; String user="hr"; String pass="hr";
			con=DriverManager.getConnection(url,user,pass);
			
			System.out.println("Connected");
			con.setAutoCommit(false); // tells that do not commit after every dml statement
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your Account ID:");
			int id = sc.nextInt();

			selectSt=con.prepareStatement("select * from account where aid=?");
			selectSt.setInt(1, id);
			ResultSet rs1=selectSt.executeQuery();
			long mb1=0L;
			String ah1="";
			double bal1=0.0;
			
			if(rs1!=null) {
				if(rs1.next()) {
					mb1=rs1.getLong("mobileno");
					ah1=rs1.getString(3);
					System.out.println(ah1);
					bal1=rs1.getDouble("balance");
					System.out.println("Your balance is "+bal1);
				}
				
			}
			System.out.println("Enter another Account ID");
			int id1=sc.nextInt();
			long mb2=0L;
			String ah2="";
			selectSt.setInt(1, id1);
			ResultSet rs2=selectSt.executeQuery();
			double bal2=0.0;
			if(rs2!=null) {
				if(rs2.next()) {
					mb2=rs2.getLong("mobileno");
					ah2=rs2.getString(3);
					
					System.out.println(ah2);
					bal2=rs2.getDouble("balance");
					System.out.println("Your balance is "+bal2);
				}
				
			}
			System.out.println("Enter the amount to transfer");
			double amt = sc.nextDouble();
			updateSt = con.prepareStatement("update account set mobileno=?, accountholder=?, balance=? where aid=?");
			updateSt.setLong(1, mb1 );
			updateSt.setString(2, ah1);
			updateSt.setDouble(3, bal1-amt);
			updateSt.setInt(4,id);
			int i1 = updateSt.executeUpdate();
			System.out.println("Account updated "+i1);
			
			updateSt.setLong(1, mb2);
			updateSt.setString(2, ah2);
			updateSt.setDouble(3, bal2+amt);
			updateSt.setInt(4,id1);
			i1+=updateSt.executeUpdate();
			System.out.println("Account updated "+i1);


			con.commit();
			sc.close();
		}
		catch(SQLException e) {
			con.rollback();
			System.out.println(e.getMessage()+" "+e.getErrorCode()+" "+e.getSQLState());
			e.printStackTrace();
		}
		finally {
			System.out.println("Closing connection!");
			if(con!=null) {
				con.close();
			}
		}
			
	}

}


