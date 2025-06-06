package java013_api.part06;

//sn변수에 저장된 문자열중에서 숫자갯수를 출력하는 프로그램을 구현하시오.
//[출력결과]
//숫자갯수:3
public class Java152_Wrapper {
public static void main(String[] args) {
	String sn = "korea12 paran3";
	//	문자열 변수 sn에 "korea12 paran3"을 저장합니다.
	//	이 문자열에는 숫자 '1', '2', '3'이 포함되어 있습니다.
	int cnt = 0;
	//	숫자의 개수를 세기 위해 카운터 cnt를 초기화합니다.
	
/////////////// 첫번째 방법	////////////////////	
//		for(int i=0; i<sn.length(); i++) {
//			char data =sn.charAt(i);
//			if (data >='0' && data <= '9')
//				cnt++;
//		} // [출력] 숫자갯수:3
	
/////////////// 두번째 방법	////////////////////
//		for(int i=0; i<sn.length(); i++) {
//		char data =sn.charAt(i);
//		if (Character.isDigit(data)) // -> 이 부분만이 변경됨!
//			cnt++;
//		}// [출력] 숫자갯수:3
		
/////////////// 세번째 방법	////////////////////
		char[] line  = sn.toCharArray();
		//문자열 sn을 문자 배열로 변환합니다.
		//결과: line = ['k','o','r','e','a','1','2',' ','p','a','r','a','n','3']
		for(char data : line) {
		//향상된 for문(= for-each)을 사용해 line 배열의 문자들을 하나씩 data에 담아 반복합니다.
		//즉, 문자열의 각 문자를 하나씩 꺼내서 검사합니다.
			if(Character.isDigit(data))
			// 현재 문자가 숫자(0~9) 인지 확인합니다.
			// 예: '1', '2', '3' → true, 나머지는 false
				cnt++;
			    // 숫자인 경우, 숫자 카운터 cnt를 1 증가시킵니다.
		}// [출력] 숫자갯수:3 ( "1", "2", "3")
 	
	System.out.println("숫자갯수:" + cnt);
}// end main()
}// end class
