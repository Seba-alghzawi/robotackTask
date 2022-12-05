package robotack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import robotack.connectionUtility.*;

public class EmployeeDAO {

	public static boolean checkUpdate=false;
	public static boolean checkAddition=false;
	public static boolean checkdeletion=false;
	public static boolean checkdeleteForRetirement=false;
	public static int countemp=0;
	public static int countEmpDep=0;
	public static void increaseSalaryForAllDevelopmentDepartmentEmployees(int id_DevelopmentDepartment,int amountOfIncreasing) {
		 
		Connection conn = null;
		PreparedStatement pstmt = null;
		String updateQuery = "UPDATE Employee SET salary = salary + ? where departmentId = ?";

		try {
			// 1- Create Connection
			conn =connectionUtility.connectionMethod();
			if (conn != null) {
				//System.out.println("connect to the dataBase done successfully.");
				
			}
			// 2- Create PrepaidStatement
			pstmt = conn.prepareStatement(updateQuery);
			pstmt.setInt(1, amountOfIncreasing);
			pstmt.setInt(2, id_DevelopmentDepartment);
			pstmt.executeUpdate();
			checkUpdate=true;
		} catch (SQLException e) {
			checkUpdate=false;
			System.out.println("connect to the dataBase does not Create successfully.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close Connection
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	public static void cheakTheExistanceOfEmployee(long empId) throws SQLException
	{
		Connection conn = null;
		conn = connectionUtility.connectionMethod();
		String checkQuery = "select count(id) AS total from Employee where id="+empId+"";
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery(checkQuery);
		while(rs.next()) {
			countemp = rs.getInt("total");
		}
		
		if (conn != null) {
			conn.close();
		}
	}
	
	
	public static void addEmployee(Employee emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String insertQuery = "insert into Employee values(?,?,?,?,?,?)";

		try {
			// 1- Create Connection
			conn = connectionUtility.connectionMethod();
			if (conn != null) {
				
				//System.out.println("connect to the dataBase done successfully.");
			}
			// 2- Create PrepaidStatement
			pstmt = conn.prepareStatement(insertQuery);

			
			pstmt.setLong(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getMsisdn());
			pstmt.setInt(4, emp.getSalary());
			pstmt.setLong(5, emp.getDepartmentId().getId());
			pstmt.setString(6, emp.getBirtDate());
			pstmt.executeUpdate();
			checkAddition=true;
		} catch (SQLException e) {
			checkAddition=false;
			System.out.println("connect to the dataBase does not Create successfully.");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close Connection
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	
	public static void deleteEmployee(int id)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String insertQuery = "delete from Employee where id=?";

		try {
			// 1- Create Connection
			conn = connectionUtility.connectionMethod();
			if (conn != null) {
				
				//System.out.println("connect to the dataBase done successfully.");
			}
			// 2- Create PrepaidStatement
			pstmt = conn.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("deletion done successfully.");
			checkdeletion=true;
		} catch (SQLException e) {
			checkdeletion=false;
			System.out.println("connect to the dataBase does not Create successfully.");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close Connection
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	public static void deleteForRetirement() throws SQLException
	{
		Connection conn =connectionUtility.connectionMethod();
		String quere ="Delete from Employee WHERE  birtDate < '1952-12-01'";
		Statement stmt = conn.createStatement();
		int rs=stmt.executeUpdate(quere);
		if(conn!=null) {
			System.out.println(rs+" Employee deleted for Retirement");
			System.out.println("***************************");
			checkdeleteForRetirement=true;
		}
		if(conn!=null)
		{
			conn.close();
		}
		

		if(stmt!=null)
		{
			stmt.close();		
		}
		
	}
	public static void CountEmployeeInDepartment(int id) throws SQLException
	{
		
			Connection conn = null;
			conn = connectionUtility.connectionMethod();
			String selectQuery = "select count(id) AS total from Employee where departmentId="+id+"";
			Statement stmt = conn.createStatement();
			ResultSet rs=stmt.executeQuery(selectQuery);
			
			while(rs.next()) {
				countEmpDep = rs.getInt("total");
				}
			
			if (conn != null) {
				conn.close();
			}
		
		
		
	}
	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
