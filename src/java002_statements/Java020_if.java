package java002_statements;

//[문제]
//data변수에 저장된 값이 대문자이면 "대문자입니다.", 소문자이면 "소문자입니다."
//그외는 "기타입니다."로 출력하는 프로그램을 구현하세요.
//
//[출력결과]
//data='D'  =>  D는 대문자입니다.
//data='d'  =>  d는 소문자입니다.
//data='1'  =>  1는 기타입니다.

public class Java020_if {

	public static void main(String[] args) {
		char data = 'd';
		// 'A'>= data <= 'z' (수학) => 수학에서 이렇게 표기하지만, 컴퓨터프로그램에서는 아래와 같이 사용된다.
		// data >= 'A' && data <='Z' (프로그램)
		// data >= 65 && data <= 90   (유니코드 or ASCII) =>문자 'A'부터 'Z'까지의 유니코드(또는 ASCII) 숫자 값
		
		
		//data >= 'A' && data <='Z' 의미 해석
		// data >= 'A' → data가 A보다 크거나 같은 문자
		//data <= 'Z' → data가 Z보다 작거나 같은 문자
		//&& → 둘 다 참일 때만 전체가 참 (AND 조건)
		// → 즉, 'A'부터 'Z' 사이의 문자냐? 라는 뜻입니다.
		
		
		
		if (data >= 'A' && data <='Z') {
				System.out.printf("%c는 대문자 입니다",data);
		} else if (data >= 'a' && data <='z') {
				System.out.printf("%c는 소문자 입니다",data);
		}else {
			System.out.printf("%c는 기타 입니다",data);
		}
		
	}// end main 
}
// end class
