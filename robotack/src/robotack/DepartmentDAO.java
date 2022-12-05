package robotack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import robotack.connectionUtility.*;

public class DepartmentDAO {

	public static int countDepartment=0;
	public DepartmentDAO() {
		// TODO Auto-generated constructor stub
	}

	public static void cheakTheExistanceOfDepartment(long Id) throws SQLException
	{
		Connection conn = null;
		conn = connectionUtility.connectionMethod();
		String checkQuery = "select count(id) AS total from Department where id="+Id+"";
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery(checkQuery);
		while(rs.next()) {
			countDepartment = rs.getInt("total");
		}
		
		if (conn != null) {
			conn.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
