package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyStatementBatchUpdate {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;		
		String url = "jdbc:mysql://localhost/mvc";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","broachilles");			
//			setAutoCommit to false
			conn.setAutoCommit(false);			
			st = conn.createStatement();
			
			st.addBatch("update user set lname = 'Hankare' where id = 103");
			st.addBatch("delete from user where id = 104");
			st.addBatch("insert into user values(106, '#Ath6saQ', 'Neeti', 'Mohan', 'user')");
			st.addBatch("update user set fname = 'Darpana',lname = 'Metha' where id = 106");
			
			int count[] = st.executeBatch();
			for (int i = 0; i < count.length; i++) {
				System.out.println("Query "+i+" has effected "+count[i]+" times");
			}
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if(st != null) st.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
	}

}
