package java015_exception;
//예외 처리 (Exception Handling): 프로그램 실행 중 발생할 수 있는 오류를 처리하는 방식입니다.
//이 코드는 배열의 인덱스 범위 초과로 발생하는 ArrayIndexOutOfBoundsException 예외를 다룹니다.

public interface Java160_exception {

 public static void main(String[] args) {
     // 크기가 3인 배열을 선언하고 초기화
     int[] num = new int[3];
     
     // 배열의 첫 번째 요소에 값 할당
     num[0] = 10;
     System.out.println(num[0]); // 10 출력, 정상적인 실행

     // 배열의 크기를 벗어난 인덱스에 값을 할당 시도 (범위 초과)
     // num 배열의 유효한 인덱스는 0, 1, 2 이므로 4는 범위를 초과
     // num[4] = 20;
     // 위 코드에서 ArrayIndexOutOfBoundsException 예외가 발생하며, 프로그램은 종료된다.
     // System.out.println(num[4]); // 예외 발생: "배열의 범위를 초과했습니다."
     
     
     /////////배열초과하는 변수 발생  해결 방법///////////
     try {
    	 num[4] = 20;
    	 System.out.println(num[4]);
	} catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex.getMessage());
		// Index 4 out of bounds for length 3 (인데스4는 길이3을 초과했다!)
	}
     
//   try{
//      //exception 발생 가능이 있는 구문
//     
//   } catch(//try영역에서 발생된 exception객체 선언){
//     //try영역에서 exception이 발생되었을때 해결해주는 구문
//     } finally{
//     //무조건 실행되는 구문
//   }

     
     
 }
}
