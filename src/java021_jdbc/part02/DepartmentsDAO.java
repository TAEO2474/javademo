package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO : Data Access Object (데이터 접근 객체)
public class DepartmentsDAO {
	private static DepartmentsDAO dao = new DepartmentsDAO();
	
	private DepartmentsDAO () {
	}
	
	
	public static DepartmentsDAO getInstance() {
	 return dao;	

	}
	//1) 테이블 전체 데이터를 조회(전체 검색)용 메서드 
	public List<DepartmentDTO> getListMethod(Connection conn){
		List<DepartmentDTO> alist = new ArrayList<DepartmentDTO> ();
		Statement stmt  =null;
		ResultSet rs = null;
		
		try {
			stmt  = conn.createStatement();
			String sql ="SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DepartmentDTO dto = new DepartmentDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getNString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				alist.add(dto); // sql데이터베이스가져온 행열의 값들을 alist 객체넣음 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
		}
		
		
		
		return alist;
	
	}
	// 2) 부서(department) 이름으로 검색하는 DAO 메서드
	public List<DepartmentDTO> getSearchMthod(Connection conn, String search){
		List<DepartmentDTO> alist = new ArrayList<DepartmentDTO> ();
		Statement stmt =null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		
		try {
// 작업자한테 불편한 검색쿼리문 
//			stmt = conn.createStatement();
//			String sql = "SELECT * FROM departments WHERE department_name LIke '%"+ search+"%' ORDER BY department_id";
//			rs = stmt.executeQuery(sql); // 질문 쿼리문 받을때 executeQuery(sql)	메소드로 받는다?
			
			String sql = "SELECT * FROM departments WHERE department_name like ? ORDER BY department_id";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,'%' + search + '%');
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DepartmentDTO dto =new DepartmentDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				alist.add(dto);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		
	return alist;	
	}
}
