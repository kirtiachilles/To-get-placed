package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyScrollableResultSetEx {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost/mvc";
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","broachilles");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			rs = stmt.executeQuery("Select fname, lname from user");
			System.out.println("ResultSet Cursor is at before first: "+rs.isBeforeFirst());
			
			/*java.sql.ResultSetMetaData rsmd =  rs.getMetaData();
			int columncount = rsmd.getColumnCount();			
			for (int i = 1; i < columncount; i++) {
				System.out.println(rsmd.getColumnName(i));
				System.out.println(rsmd.getColumnType(i));
			}
			*/
			while(rs.next()){
				System.out.println("Fname " + rs.getString(1) +" Lname "+  rs.getString(2) );
			}
			System.out.println("\n");
			while(rs.previous()){
				System.out.println("Fname " + rs.getString(1) +" Lname "+  rs.getString(2) );
			}			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				System.out.println("Exception in closing Resources "+e2.getMessage());
			}
		}
	}

}
