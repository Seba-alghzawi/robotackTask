package robotack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

	public static final int increaseSalaryEmployeesWorkingInDevelopmentDepartment = 1;
    public static final int addEmployeesToHRDepartment = 2;
    public static final int deleteEmployee = 3;
    public static final int deleteEmployeesBornInAYear1952= 4;
    public static final int countEmployeesInSpecificDepartment = 5;
    public static final int ExitProgram = 6;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args)throws  IOException, SQLException {
		BufferedReader reader;
		int input;
		 
		while(true)
		{
			System.out.println("1-increase salary employees working in Development Department.");
			System.out.println("2-add Employees to HR Department.");
			System.out.println("3- delete Employee.");
			System.out.println("4-delete employees born in a year 1952 to retirement.");
			System.out.println("5-count employees in a specific department.");
			System.out.println("6-ExitProgram");
			System.out.println("please inter your option ");
			System.out.println("******************************************");
			try {
				 reader = new BufferedReader(new InputStreamReader(System.in));
				 input=Integer.parseInt(reader.readLine());
				 switch(input)
				 {
				 case(1):
					System.out.println("please insert the id of the Development Department.");
				 	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
				 	int input1=Integer.parseInt(reader1.readLine());
				 	System.out.println("please insert the value of increase to increase salaries");
				 	reader1 = new BufferedReader(new InputStreamReader(System.in));
				 	int input2=Integer.parseInt(reader1.readLine());
				 	EmployeeDAO.increaseSalaryForAllDevelopmentDepartmentEmployees(input1, input2);
				 	if(EmployeeDAO.checkUpdate)
				 	{
				 		System.out.println("the increasing done succefully");
				 		System.out.println("1- retrun to main page");
						System.out.println("2- exit program ");
						 System.out.println("*************************************************");
				 		 reader = new BufferedReader(new InputStreamReader(System.in));
						  input=Integer.parseInt(reader.readLine());
						 switch(input)
						 {
						 case(1):
						 
							 break;
						 
						 case(2):
						 
							 System.exit(0);
						     break;
						 default:
					    	 System.out.println("please enter valid value ");
					    	 System.out.println("*************************************************");
					    	 break;
						 }
				 	}
				 	else
				 	{
				 		System.out.println("Sorry we have error while updating data(the increasing does not done succefully)");
						System.out.println("1- retrun to main page");
						System.out.println("2- exit program ");
						 System.out.println("*************************************************");
						 reader = new BufferedReader(new InputStreamReader(System.in));
						  input=Integer.parseInt(reader.readLine());
						 switch(input)
						 {
						 case(1):
						 
							 break;
						 
						 case(2):
						 
							 System.exit(0);
						     break;
						 default:
					    	 System.out.println("please enter valid value ");
					    	 System.out.println("*************************************************");
					    	 break;
						 }
				 		
				 	}
					 break;
				 
				 case(2):
					 System.out.println("please insert the id of the HR Department.");
				 	 reader = new BufferedReader(new InputStreamReader(System.in));
				 	long inputDepartmentID=Integer.parseInt(reader.readLine());
				 	System.out.println("please insert the id of the Employee.");
				 	BufferedReader readerId = new BufferedReader(new InputStreamReader(System.in));
				 	long inputId= Integer.parseInt(readerId.readLine());
				 	EmployeeDAO.cheakTheExistanceOfEmployee(inputId);
				 	if(EmployeeDAO.countemp!=0)
				 	{
				 		System.out.println("sorry this employee is already exist");
				 		System.out.println("1- retrun to main page");
						System.out.println("2- exit program ");
						 System.out.println("*************************************************");
				 		 reader = new BufferedReader(new InputStreamReader(System.in));
						  input=Integer.parseInt(reader.readLine());
						 switch(input)
						 {
						 case(1):
						 
							 break;
						 
						 case(2):
						 
							 System.exit(0);
						     break;
						 default:
					    	 System.out.println("please enter valid value ");
					    	 System.out.println("*************************************************");
					    	 break;
				 		
						 }
						 break;
				 	}
						 else
						 {
							 System.out.println("please insert the name of the Employee.");
							 	BufferedReader readerName = new BufferedReader(new InputStreamReader(System.in));
							 	String inputName=readerName.readLine();
							 	System.out.println("please insert the Msisdn of the Employee.");
							 	BufferedReader readerMsisdn = new BufferedReader(new InputStreamReader(System.in));
							 	String inputMsisdn=readerMsisdn.readLine();
							 	System.out.println("please insert the salary of the Employee.");
							 	BufferedReader readerSalary = new BufferedReader(new InputStreamReader(System.in));
							 	int inputSalary=Integer.parseInt(readerSalary.readLine());
							 	Department department=new Department(inputDepartmentID,"HR");
							 	System.out.println("please insert the birthDate of the Employee.");
							 	BufferedReader departmentBirthDate = new BufferedReader(new InputStreamReader(System.in));
							 	String inputbirthDate=readerMsisdn.readLine();
							 	Employee emp=new Employee(inputId,inputName,inputMsisdn,inputSalary,department,inputbirthDate);
							 	EmployeeDAO.addEmployee(emp);
							 	if(EmployeeDAO.checkAddition)
							 	{
							 		System.out.println("employee added successfully.");
							 		System.out.println("1- retrun to main page");
									System.out.println("2- exit program ");
									 System.out.println("*************************************************");
							 		 reader = new BufferedReader(new InputStreamReader(System.in));
									  input=Integer.parseInt(reader.readLine());
									 switch(input)
									 {
									 case(1):
									 
										 break;
									 
									 case(2):
									 
										 System.exit(0);
									     break;
									 default:
								    	 System.out.println("please enter valid value ");
								    	 System.out.println("*************************************************");
								    	 break;
									 }
							 	}
							 	else
							 	{
							 		System.out.println("employee does not added successfully.");
							 	
							 		System.out.println("1- retrun to main page");
									System.out.println("2- exit program ");
									 System.out.println("*************************************************");
									 reader = new BufferedReader(new InputStreamReader(System.in));
									  input=Integer.parseInt(reader.readLine());
									 switch(input)
									 {
									 case(1):
									 
										 break;
									 
									 case(2):
									 
										 System.exit(0);
									     break;
									 default:
								    	 System.out.println("please enter valid value ");
								    	 break;
									 }
									 
									 break;
							 	}
							 
						 }
				 	break;
				 
				 case(3):
					 	System.out.println("please insert the id of the employee you want to delete .");
				 		reader1 = new BufferedReader(new InputStreamReader(System.in));
				 		input1=Integer.parseInt(reader1.readLine());
				 		EmployeeDAO.cheakTheExistanceOfEmployee(input1);
					 	if(EmployeeDAO.countemp==0)
					 	{
					 		System.out.println("sorry this employee does not exist");
					 		System.out.println("1- retrun to main page");
							System.out.println("2- exit program ");
							 System.out.println("*************************************************");
					 		 reader = new BufferedReader(new InputStreamReader(System.in));
							  input=Integer.parseInt(reader.readLine());
							 switch(input)
							 {
							 case(1):
							 
								 break;
							 
							 case(2):
							 
								 System.exit(0);
							     break;
							 default:
						    	 System.out.println("please enter valid value ");
						    	 System.out.println("*************************************************");
						    	 break;
					 		
							 }
							 break;
					 	}else
					 	{
					 		EmployeeDAO.deleteEmployee(input1);
					 		 System.out.println("*************************************************");
					 		System.out.println("1- retrun to main page");
							System.out.println("2- exit program ");
							 System.out.println("*************************************************");
					 		 reader = new BufferedReader(new InputStreamReader(System.in));
							  input=Integer.parseInt(reader.readLine());
							 switch(input)
							 {
							 case(1):
							 
								 break;
							 
							 case(2):
							 
								 System.exit(0);
							     break;
							 default:
						    	 System.out.println("please enter valid value ");
						    	 System.out.println("*************************************************");
						    	 break;
					 		
							 }
							
					 	}
					 break;
				 
				 case(4):
					 EmployeeDAO.deleteForRetirement();
			 		System.out.println("1- retrun to main page");
					System.out.println("2- exit program ");
					 System.out.println("*************************************************");
			 		 reader = new BufferedReader(new InputStreamReader(System.in));
					  input=Integer.parseInt(reader.readLine());
					 switch(input)
					 {
					 case(1):
					 
						 break;
					 
					 case(2):
					 
						 System.exit(0);
					     break;
					 default:
				    	 System.out.println("please enter valid value ");
				    	 System.out.println("*************************************************");
				    	 break;
					 }
					 break;
					 
				 
				 case(5):
					 System.out.println("please insert the id of the Department.");
				 	 reader1 = new BufferedReader(new InputStreamReader(System.in));
				 	 input1=Integer.parseInt(reader1.readLine());
				 	DepartmentDAO.cheakTheExistanceOfDepartment(input1);
				 	 if(DepartmentDAO.countDepartment!=0)
				 	 {
				 		EmployeeDAO.CountEmployeeInDepartment(input1);
				 		 System.out.println(EmployeeDAO.countEmpDep +" employee in this department");
				 		 System.out.println("*************************************************");
					 		System.out.println("1- retrun to main page");
							System.out.println("2- exit program ");
							 System.out.println("*************************************************");
					 		 reader = new BufferedReader(new InputStreamReader(System.in));
							  input=Integer.parseInt(reader.readLine());
							 switch(input)
							 {
							 case(1):
							 
								 break;
							 
							 case(2):
							 
								 System.exit(0);
							     break;
							 default:
						    	 System.out.println("please enter valid value ");
						    	 System.out.println("*************************************************");
						    	 break;
					 		
							 }
							 break;
				 	 }
				 	 else
				 	 {
				 		 System.out.println("sorry there is no department with this id");

				 		 System.out.println("*************************************************");
					 		System.out.println("1- retrun to main page");
							System.out.println("2- exit program ");
							 System.out.println("*************************************************");
					 		 reader = new BufferedReader(new InputStreamReader(System.in));
							  input=Integer.parseInt(reader.readLine());
							 switch(input)
							 {
							 case(1):
							 
								 break;
							 
							 case(2):
							 
								 System.exit(0);
							     break;
							 default:
						    	 System.out.println("please enter valid value ");
						    	 System.out.println("*************************************************");
						    	 break;
					 		
							 }
							 
				 	 }
					 break;
				 
				 case(6):
					 System.exit(0);
					 break;
				 }
			}catch(NumberFormatException nfe) {
				 System.out.println(" invalid number input please inter valid value");
				 System.out.println("*************************************************");
			}catch(Exception nfe) {
				nfe.printStackTrace();
			}
		}

	}

}
