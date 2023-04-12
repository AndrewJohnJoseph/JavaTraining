package com.eleventhapr.console;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.eleventhapr.model.Employee;
import com.eleventhapr.service.EmployeeDaoImpl;

public class OracleExample {
	
	public static Connection conn;
	
	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","abc123" );
		}
		catch(SQLException sqlExp) {
			sqlExp.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		EmployeeDaoImpl empImpl = new EmployeeDaoImpl();
		int choice = 0;
		List<Employee> lst = new ArrayList<Employee>();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		do {
			
			System.out.println("1. Add Employee");
			System.out.println("2. Get Employee By ID");
			System.out.println("3. Get All Employees");
			System.out.println("4. Update Employee By ID");
			System.out.println("5. Delete Employee By ID");
			System.out.println("6. Exit");
			System.out.print("Enter Your Choice : ");
			try {
				choice = Integer.parseInt(br.readLine());
				switch(choice) {
					case 1:
						System.out.print("Enter New Employee ID : ");
						int _id = Integer.parseInt(br.readLine());
						System.out.print("Enter Employee First Name : ");
						String _firstname = br.readLine();
						System.out.print("Enter Employee Last Name : ");
						String _lastname = br.readLine();
						Employee emp = new Employee(_id, _firstname, _lastname);
						empImpl.insertEmployee(emp);
						break;
					case 2:
						System.out.print("Enter Employee ID : ");
						int _getid = Integer.parseInt(br.readLine());
						empImpl.getEmployee(_getid);
						System.out.println(lst);
						break;
					case 3:
						empImpl.getEmployees();
						break;
					case 4:
						System.out.print("Enter Employee ID to be Updated : ");
						int _upid = Integer.parseInt(br.readLine());
						System.out.print("Enter Employee First Name : ");
						String _upfirstname = br.readLine();
						System.out.print("Enter Employee Last Name : ");
						String _uplastname = br.readLine();
						Employee upemp = new Employee(_upid, _upfirstname, _uplastname);
						empImpl.updateEmployee(upemp);
						break;
					case 5:
						System.out.print("Enter Employee ID to be Deleted : ");
						int _delid = Integer.parseInt(br.readLine());
						empImpl.deteleEmployee(_delid);
						break;
					case 6:
						System.out.println("Exited");
						System.exit(0);
						break;
					default:
						System.out.println("Enter Valid Choice...");
						break;
				}
			}
			catch(Exception exp) {
				
			}
			System.out.println(choice);
		}while(choice < 6);
	}

}
