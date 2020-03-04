package com.traffic.web.admin.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DB {

	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/smarttrafficapp", "root", "");
	
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
}
