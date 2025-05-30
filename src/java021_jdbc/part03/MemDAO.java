package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java021_jdbc.part02.JdbcTemplate;

//DAO : Data ACCESS Object (데이터 접근 객체 클래스)
public class MemDAO {
	
	private MemDAO() {
	}

	
	private static MemDAO dao = new MemDAO();

	
	public static MemDAO getInstance() {
		return dao;
	}
////////////////////////////////////////////////////////////////	
	public int getDelateMethod(Connection conn, int num) {
		int chk = 0;
		PreparedStatement pstmt = null;
	
		try {
			String sql =  "DELETE FROM mem  WHERE num=?";
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			chk = pstmt.executeUpdate(); // INSERT,UPDATE,DELETE 경우executeUpdate() 메소드 사용
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(pstmt);
		}
	
	
	
		return chk;
	}// end getDelateMethod 메소드
/////////////////////////////////////////////////////////////////////////////////////////////////////	
	public int getUpdateMethod(Connection conn, HashMap<String,Object> hMap) {
		int chk = 0;
		PreparedStatement pstmt = null;
	
		try {
			String sql =  "UPDATE mem SET name=?, age=?,loc=? WHERE num=?";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, (String)hMap.get("name"));
			pstmt.setInt(2, (int)hMap.get("age"));
			pstmt.setString(3, (String)hMap.get("loc"));
			pstmt.setInt(4, (int)hMap.get("num"));
			chk = pstmt.executeUpdate(); // INSERT,UPDATE,DELETE 경우executeUpdate() 메소드 사용
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(pstmt);
		}
		
		return chk;
	}
	

/////////////////////////////////////////////////////////////////////////////////////////////////	
	public int getInsertMethod(Connection conn, MemDTO dto) {
		int chk = 0;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "INSERT INTO mem(num, name, age,loc) VALUES(mem_num_seq.nextval,?,?,?)";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());
			chk = pstmt.executeUpdate(); // INSERT,UPDATE,DELETE 경우executeUpdate() 메소드 사용
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}	
		return chk;
	}// end	getInsertMethod() 메소드 
	
///////////////////////////////////////////////////////////////////////////////////////////////////	
	public List<MemDTO> getListMethod(Connection conn) {
		List<MemDTO> alist = new ArrayList<MemDTO>();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM mem ORDER BY num DESC";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemDTO dto = new MemDTO();// 질문: while 문에서 MemDTO()객체가 생성되는 이유?
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				alist.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
		}
		return alist;
	}

}// end class
