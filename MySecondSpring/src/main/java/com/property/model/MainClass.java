package com.property.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	public static Connection conn;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("props-config.xml");
		
		MyDao dao = (MyDao) context.getBean("dao");
		System.out.println(dao.getDbname() + " " + dao.getUname() + " " + dao.getPassword());
		conn = MainClass.getDBConnection(dao.getDbname(), dao.getUname(), dao.getPassword());
	}
	
	public static Connection getDBConnection(String dbname, String username, String password) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","abc123" );
			conn = DriverManager.getConnection("jdbc:oracle:thin:@"+dbname+":1521:xe",username,password );
			System.out.println("Connection successful");
		}
		catch(SQLException sqlExp) {
			sqlExp.printStackTrace();
		}
		return conn;
	}

}
