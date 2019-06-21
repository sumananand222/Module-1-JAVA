//Using account ID to delete record

package cg;
import java.sql.*;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection con=null;
		//PreparedStatement updateSt=null;
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

			selectSt=con.prepareStatement("delete from account where aid=?");
			selectSt.setInt(1, id);
			selectSt.executeQuery();
			System.out.println("Account Deleted!");

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


