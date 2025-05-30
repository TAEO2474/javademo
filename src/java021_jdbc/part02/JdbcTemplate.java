package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Expression Edition : xe
 * Enterprise Edition : orcl
*/

public class JdbcTemplate {
	public static Connection getConnection() {
		Connection conn = null;
		
		//1. JDBC 드라이버 연동을 위한 준비 단계
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2.DB서버연결
			String url ="jdbc:oracle:thin:@127.0.01:1521:xe";
			String ugername = "hr";
			String password ="a1234";
			conn = DriverManager.getConnection(url,ugername,password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static boolean isConnection(Connection conn) throws SQLException{
		Boolean valid = true;
		if (conn == null || conn.isClosed()) {
			valid =false;
		}
		return false;
	}
		
	
	public static void close(ResultSet rs) {
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	//Statement와 prepareStatement 객체종료
	public static void close(Statement stmt) {	
		if(stmt != null) 
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}// end close

	
	public static void close(Connection conn) {	
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}//end close
	
	public static void commit(Connection conn) {
		try {
			  if(isConnection(conn));
		         conn.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}//end commit
	
	public static void rollback(Connection conn) {
		   try {
			    if(isConnection(conn));	
			    conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
	}
	 
	 
	
	
	
	
}//end class


