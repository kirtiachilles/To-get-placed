package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class MySqlAccess {
	
	private Connection conn=null;
    private Statement st=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    
  
	public void readDatabase() throws Exception{
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		conn=DriverManager.getConnection("jdbc:mysql://localhost/feedback?"+"user=kirti&password=kirti");
    		st=conn.createStatement();
    		
    		rs=st.executeQuery("select * from feedback.comments");    		
    		writeResultSet(rs);
    		
    		ps=conn.prepareStatement("insert into feedback.comments values(default,?,?,?,?,?,?)");
    		ps.setString(1, "Test");
    		ps.setString(2, "TestEmail");
    		ps.setString(3, "TestWebpage");
    		ps.setDate(4, new java.sql.Date(System.currentTimeMillis()));
    		ps.setString(5, "TestSummary");
    		ps.setString(6, "TestComment");
    		ps.executeUpdate();
    		
    		ps=conn.prepareStatement("select myuser, webpage, dateum, summary, comments from feedback.comments");
    		rs=ps.executeQuery();
    		writeResultSet(rs);
    		
    		
    	} catch(Exception e){
    		throw e;
    	}
    	finally {
//    		close();
    		conn.close();
    		st.close();
    		rs.close();
    	}
    }
    
    private void writeResultSet(ResultSet rs) throws SQLException{
    	
    	while(rs.next()){
    		String user=rs.getString("myuser");
    		String website=rs.getString("webpage");
    		String summary=rs.getString("summary");
    		Date date=rs.getDate("dateum");
    		String comment=rs.getString("comments");
    		
    		System.out.println("User: "+user);
    		System.out.println("Website: "+website);
    		System.out.println("Summary: "+summary);
    		System.out.println("Date: "+date);
    		System.out.println("Coments: "+comment);
    		System.out.println("\n");
    	}
    }
    
  /*  private void close(){
    	close(conn);
    	close(rs);
    	close(st);
    }
    
    private void close(Closeable c){
    	try {
			if(c!=null)
				c.close();
		} catch (Exception e) {}
    }
   */
}	//End of class
