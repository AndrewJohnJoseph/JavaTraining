package com.eleventhapr.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.eleventhapr.console.OracleExample;
import com.eleventhapr.model.Employee;
import com.eleventhapr.model.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
	
	Connection conn;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;

	@Override
	public void insertEmployee(Employee emp) {
		conn = OracleExample.getDBConnection();
		try {
			ps = conn.prepareStatement("insert into sys.Employee values(?, ?, ?)");
			ps.setInt(1, emp.getId());
			ps.setString(2,  emp.getFirstname());
			ps.setString(3, emp.getLastname());
			
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " got inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getEmployee(int id) {
		conn = OracleExample.getDBConnection();
		try {
			stmt = conn.createStatement();
		
			rs = stmt.executeQuery("select * from Employee where id = " + id);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void getEmployees() {
		// TODO Auto-generated method stub
		conn = OracleExample.getDBConnection();
		try {
			stmt = conn.createStatement();
		
			rs = stmt.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(Employee emp) {
		conn = OracleExample.getDBConnection();
		try {
			ps = conn.prepareStatement("Update sys.Employee set firstname=?, lastname=? where id = " + emp.getId());
			ps.setString(1,  emp.getFirstname());
			ps.setString(2, emp.getLastname());
			
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " got updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deteleEmployee(int id) {
		conn = OracleExample.getDBConnection();
		try {
			ps = conn.prepareStatement("delete from sys.Employee where id = " + id);
			
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " got deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
