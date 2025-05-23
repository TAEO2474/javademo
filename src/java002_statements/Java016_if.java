package java002_statements;

public class Java016_if {
//  제어문(control statement) : 문장의 흐름을 제어해 주는 기능이다.
//  1. 종류
//     조건문 : if~else, switch~case
//     반복문 : for, do ~ while
//     제어문에서 사용되는 키워드: break, continue
//    
//     if(조건식){
//       조건식이 참일 때 수행 문장;
//     else{
//       조건식

	public static void main(String[] args) {
		int num = 4;
		// System.out.println("num="+num);

		// if (num % 2 != 1)
		// 해석: num % 2는 num을 2로 나눈 나머지를 계산합니다.
		// 해석: != 1은 그 결과가 1이 아니면 조건이 참(True)이 됩니다.
		if (num % 2 == 0) {
			System.out.printf("%d는 짝수 입니다.\n", num);
		} else {
			System.out.printf("%d는 홀수 입니다.\n", num);
		}
		System.out.println("프로그램 종료");

	}

}
 