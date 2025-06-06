package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;

public class MemController {
	
	private MemService service;
	
	
	public MemController() {
		service = new MemService();
	}
	
	public int delateExecute(int num) {
		return service.getDelateProcess(num);
	}
	
	
	public int updateExecute(HashMap<String,Object> hMap ) {
		return service.getUpdateProcess(hMap);
	}
	
	
	public int insertExecute(MemDTO dto) {
		return service.getInsertProcess(dto);
	}
	
	public List<MemDTO> listExecute(){
		return service.getListProcess();
		
	}
		
	
}
