package cg;
import java.sql.*;
public class Demo2 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:oracle:thin:@localhost:1521:xe"; String user="hr"; String pass="hr";
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connected");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);//used to pass sql queries
		ResultSet rs = st.executeQuery("Select * from account");
		rs.afterLast(); // moves the cursor after last record
		while(rs.previous()) {
			int a_id = rs.getInt(1);
			long mob = rs.getLong(2);
			String ah = rs.getString(3);
			double bal = rs.getDouble(4);
			System.out.println("Account id "+a_id+", Mobile "+mob+", Name "+ah+", Balance "+bal);
			System.out.println("================================================================");
		}
		con.close();
		rs.close();
	}
}
