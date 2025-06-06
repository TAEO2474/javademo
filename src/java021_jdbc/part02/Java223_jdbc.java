package java021_jdbc.part02;

import java.util.List;
import java.util.Scanner;

/* MVC패턴
* Model : 데이터 관리(DTO, DAO)
* View : 결과화면
* Controller : 클라이언트 요청과 응답처리, Model과 View 연결
*
*/

public class Java223_jdbc {

	public static void main(String[] args) {
	 DepartmentController dController = new DepartmentController();
	 
	 List<DepartmentDTO> alist = null;
	 Scanner sc  = new Scanner(System.in); // 스캐너 임포트하기 
	 System.out.print("1전체, 2 검색어 :");
	 int input  = Integer.parseInt(sc.nextLine());
	 if(input ==1) {
		 alist = dController.listprocess();
	 }else if (input==2) {
		 System.out.print("부서명 입력 : ");
		 String search = sc.nextLine();
		 alist = dController.listSerchProcess(search);
	 
	 }	
		
		display(alist);
	}// end main

	
	 public static void display(List<DepartmentDTO> alist) {
		 for(DepartmentDTO dto : alist)
			 System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), 
					 dto.getManager_id(), dto.getLocation_id());
	 
	}// end display

}// endclass
