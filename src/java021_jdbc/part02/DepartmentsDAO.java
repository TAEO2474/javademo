package java021_jdbc.part02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import java021_jdbc.template.JdbcTemplate;

// DAO : Data Access Object (데이터 접근 객체)
public class DepartmentsDAO {
	private static DepartmentsDAO dao = new DepartmentsDAO();
	
	private DepartmentsDAO () {
	}
	
	
	public static DepartmentsDAO getInstance() {
	 return dao;	

	}
	
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
	
}
