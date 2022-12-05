package robotack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionUtility {

	public connectionUtility() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection connectionMethod() throws SQLException
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/robotack";
		String username="root";
		String password="Loveseba@1999";
		conn=DriverManager.getConnection(url, username, password);
		return conn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
