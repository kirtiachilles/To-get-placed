package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * Batch update is nothing but executing set of queries at a time. 
 * Batch updates reduces number of database calls.
 * In batch processing, batch should not contain select query.
 * When we are using PreparedStatement to execute batch update, we have to run the same query multiple times.
 * Below examples shows how to do batch updates with PreparedStatement.
 * */
public class MyBatchPreparedStmt {

	@SuppressWarnings({ "null", "resource" })
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:mysql://localhost/mvc";
		String query = "update category set cat_name = ? where cat_id = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","broachilles");			
//			setAutoCommit to false
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "Electronics");
			pstmt.setInt(2, 4);
			pstmt.addBatch(); //added to batch
			pstmt.setString(1, "Fitness");
			pstmt.setInt(2, 5);
			pstmt.addBatch(); //added to batch
			pstmt = conn.prepareStatement("insert into user values (?,?,?,?,?)");
			pstmt.setInt(1, 102);
			pstmt.setString(2, "brorule");
			pstmt.setString(3, "Rohit");
			pstmt.setString(4, "Jadhav");
			pstmt.setString(5, "user");
			pstmt.addBatch(); //added to batch
			int count[] = pstmt.executeBatch();
			for (int i = 0; i < count.length; i++) {
				System.out.println("Query "+i+" has affected "+count[i]+" times");
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
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch (Exception ex) {}
        }
	}

}
