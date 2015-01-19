package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {
	
	    void read() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=null;
		ResultSet rs = null;
		Statement stmt=null;
		String url="jdbc:mysql://localhost/mvc";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
				conn=DriverManager.getConnection(url,"root","broachilles");
				stmt=conn.createStatement();
				rs=stmt.executeQuery("select * from user");
				writeData(rs);			
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();				
			}finally{
				rs.close();
				stmt.close();
				conn.close();
			}
	}
	private void writeData(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()){
				int UserId=Integer.parseInt(rs.getString("id"));
				String Password=rs.getString("password");
				String FirstName=rs.getString("fname");
				String lastName=rs.getString("lname");
				
				System.out.println("User: "+UserId);
				System.out.println("Password: "+Password);
				System.out.println("FirstName: "+FirstName);
				System.out.println("lastName: "+lastName);
				System.out.println("");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
