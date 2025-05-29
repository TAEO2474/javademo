package java021_jdbc.part02;

import java.util.List;

public class DepartmentController {

	private DepartmentsService service;
	
	public DepartmentController() {
		service = new DepartmentsService();
		
	}
	
	public List<DepartmentDTO> listprocess(){
		return service.getDepartmentsList();
	}
	

}