package java021_jdbc.part01;

import java.sql.Statement;

import javax.print.DocFlavor.STRING;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
//try-catch 문이란?
//오류(예외)가 발생할 수 있는 코드를 try 블록 안에 쓰고,
//만약 오류가 발생하면 catch 블록이 그 오류를 잡아서 처리시킨다.

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public JdbcTest() {
		
	}

	public void process() {
		try {
			//1. JDBC 드라이버 연동을 위한 준비 단계
			Class.forName("oracle.jdbc.OracleDriver"); //JDBC 드라이버 로딩 (드라이버 클래스 찾기)
			
			//2.DB서버연결
			String url ="jdbc:oracle:thin:@127.0.01:1521:xe";
			String ugername = "hr";
			String password ="a1234";
			conn = DriverManager.getConnection(url,ugername,password);
			//System.out.println(conn); 연결확인용
			
			//3. 쿼리문 실행을 위한 Statement 객체생성 
			stmt = conn.createStatement();
			
			//4. 쿼리문을 실행 
			// SELECT - ResultSet excuteQuery(),
			// UPDATE,INSERT,DELETE - int excuteUpdate()
			String sql ="SELECT * FROM mem";
			rs = stmt.executeQuery(sql);
			System.out.println(rs);
			
			//5. 쿼리의 결과 출력
			// rs.next() : 다음에 읽어올 레코드가 있는지 여부를 체크한다.
		    while(rs.next()) {
		    	int num = rs.getInt("num"); // num number
		    	String name = rs.getString("name"); //name varchar2
		    	int age = rs.getInt ("age");
		    	String loc =rs.getString("loc");
		    		
		    	System.out.printf("%d %s %d %s \n",num,name,age, loc);
		    }
			
		} catch (ClassNotFoundException e) {//드라이버 클래스가 없을 때 발생하는 예외
		
			e.printStackTrace();//오류 내용을 자세히 출력 (디버깅용)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6.자원종료
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			if(stmt != null){
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}	
				}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		

	} //end main

}// end class
