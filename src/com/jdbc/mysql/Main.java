package com.jdbc.mysql;

import java.sql.SQLException;

import com.jdbc.mysql.MySqlAccess;

public class Main {

	public static void main(String[] args) throws Exception{
//		MySqlAccess obj=new MySqlAccess();
//		obj.readDatabase();
		
		MySql my=new MySql();
		try {
			my.read();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
