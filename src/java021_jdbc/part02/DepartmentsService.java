package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

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
	}
	
}
