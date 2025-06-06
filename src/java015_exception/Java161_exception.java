package java015_exception;
//예외처리
//1  try{
////exception 발생 가능이 있는 구문
//}catch(//try영역에서 발생된 exception객체 선언){
////try영역에서 exception이 발생되었을때 해결해주는 구문
//}finally{
////무조건 실행되는 구문
//}
public class Java161_exception {


		public static void main(String[] args) {
			// StringBuffer 객체를 선언만 하고 초기화하지 않음 (null 상태)
			StringBuffer sBuffer = null;

			try {
				// sBuffer는 현재 null이므로 reverse()를 호출하면 NullPointerException 발생
				sBuffer.reverse();
			} catch (NullPointerException ex) {
				// 예외 발생 시 catch 블록 실행
				// 예외 처리: null 상태의 sBuffer를 새로운 객체로 생성하고 문자열 초기화
				sBuffer = new StringBuffer("java");

				// 문자열 "java"를 뒤집는다 → "avaj"
				sBuffer.reverse();

				// 뒤집은 결과 출력
				System.out.println(sBuffer);  // 출력: avaj
			}
		}
	}
		
	

