package java002_statements;
//if(조건식){
//if(조건식){
//  수행문장;
//}else{
//  수행문장;
//}

//}else{
//if(조건식){
//   수행문장;
//}else{
//    수행문장;
//}

public class Java018_if {

	public static void main(String[] args) {
		boolean member = false; //회원 (true) or 비회원 (false)
		
		String grade ="일반"; // 회원등급 (VIP, 일반)
		
		if(member) {
		//회원
		 if(grade == "VIP") {
		// 회원이고 회원등급이 VIP일떄
			 System.out.printf("고객님은 %s이며 %d%% 적립했습니다.\n", grade, 30);
		
		}else {
			//회원이고 회원등급이 일반일떄
			System.out.printf("고객님은 %s이며 %d%% 적립했습니다.\n", grade, 10);
		}
		}else {
			// 비회원
			System.out.printf("고객님은 %s이며 %d%% 적립했습니다.\n", "비회원", 0);
		}
	
		System.out.printf("고객님 오늘도 방문해주셔서 감사합니다.");
	}// end main 

} //end class 

// 표기 의미 정리
//%s → 문자열(String)을 넣을 자리입니다.
//%d → 정수(decimal, 즉 int형 정수)를 넣을 자리입니다.
//%% → % 기호 자체를 출력할 때 씁니다 (그냥 % 하나만 쓰면 자바는 형식 지정자로 인식해서 오류가 납니다).