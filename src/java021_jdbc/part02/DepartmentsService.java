package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DepartmentsService {
	DepartmentsDAO dao = null;
	
	public DepartmentsService() {
	
	}

	public List<DepartmentDTO> getDepartmentsList(){
		List<DepartmentDTO> alist = null;
		Connection conn = JdbcTemplate.getConnection();
		dao = DepartmentsDAO.getInstance();
		try {
			conn.setAutoCommit(false); // 자동 커밋 해제
			alist = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
			
		} catch (SQLException e) {			
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		return alist;
	}//end getDepartmentsList() 메소드
	
	public  List<DepartmentDTO> getSearchList(String search) {
		List<DepartmentDTO> alist = null;
		Connection conn = JdbcTemplate.getConnection();
		dao = DepartmentsDAO.getInstance();
		
		try {
			conn.setAutoCommit(false);
			alist = dao.getSearchMthod(conn, search);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}
	     return alist;
	}// end getSearchList() 메소드
	
	
}// end class
