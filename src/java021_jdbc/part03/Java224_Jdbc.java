package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Java224_Jdbc {

	public static void main(String[] args) {
		MemController memController = new MemController();
		Scanner sc  = new Scanner(System.in);
		while (true) {
			System.out.println("============================");
			System.out.print("1 리스트, 2 삽입, 3 수정, 4 삭제, 0 종료 : ");
			int input  = Integer.parseInt(sc.nextLine());
			if(input ==1) {
				// 리스트
			    listcall (memController);
			
			} else if(input ==2) {
			    insertCall(memController,sc);
			}else if(input ==3) {
				updateCall(memController,sc);
			}else if(input ==4) {
				delateCall(memController,sc);
			}else if(input ==0) {
				System.out.println("시스템 종료");
				sc.close();
				System.exit(0);
			}
		}
	
 }// end main/////////////////////////////////////////////////////////
	//delateCall 메소드
	public static void delateCall(MemController memController,Scanner sc) {
		System.out.print("삭제번호입력 :  ");
		int num = Integer.parseInt(sc.nextLine());
		
		int chk = memController.delateExecute(num);
		System.out.printf("%d개 삭제\n", chk);
		
	
	}// end delateCall 메소드
	
	
	
	
	//updateCall 메소드
	public static void updateCall(MemController memController,Scanner sc) {
		System.out.print("번호입력 :  ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print("이름입력 :  ");
		String name = sc.nextLine();
		
		System.out.print("나이입력 :  ");
		int age = Integer.parseInt(sc.nextLine());
	
		System.out.print("지역입력 :  ");
		String loc = sc.nextLine();
		
		// int chk = memController.updateExecute(new MemDTO(num, name,age,loc));
		HashMap<String,Object> hMap = new HashMap<String,Object>();
		hMap.put("num", num);
		hMap.put("name", name);
		hMap.put("age", age);
		hMap.put("loc", loc);
		int chk = memController.updateExecute(hMap);
				
		System.out.printf("%d개 수정\n", chk);
		
	
	}// end updateCall 메소드
	
	

	// insertCall 삽입메소드
	public static void insertCall(MemController memController,Scanner sc) {
		System.out.print("이름입력 :  ");
		String name = sc.nextLine();
		
		System.out.print("나이입력 :  ");
		int age = Integer.parseInt(sc.nextLine());
	
		System.out.print("지역입력 :  ");
		String loc = sc.nextLine();
		
		int chk = memController.insertExecute(new MemDTO(name,age,loc));
		System.out.printf("%d개 삽입\n", chk);
	}// end insertCall메소드
	
	
	// listcall 리스트 검색 메소드 
	public static void listcall(MemController memController) {
		List<MemDTO> aList = memController.listExecute();
		if(aList.size()==0) {
			System.out.println("데이터가 없습니다");
		}else {
			for(MemDTO dto : aList)
				System.out.printf("%d %s %d %s\n",
						dto.getNum(),dto.getName(),dto.getAge(), dto.getLoc());
		}
	
	}// end listcall  메소드 
	
}// end class