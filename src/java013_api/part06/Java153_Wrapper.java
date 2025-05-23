package java013_api.part06;

import java.util.Scanner;
//이름, 학점을 입력하는 프로그램을 구현하시오.
//입력 : 홍길동,80,93
//
//[출력결과]
//이름: 홍길동
//국어: 80
//영어: 93
//평균: 86.5 (double로 계산)

public class Java153_Wrapper {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("입력 :");
	String line = sc.nextLine();
	String[] data = line.split(",");
	// parseDouble: 기본형 double 반환
	double avg = (Double.parseDouble(data[1]) + Double.parseDouble(data[2])) /2;
	//	data[1], data[2]는 "국어 점수", "영어 점수"가 문자열(String)로 들어옵니다.
	//	이를 **실수(double)**로 변환하기 위해 Double.parseDouble()을 사용하고 있어요.
	
	//  추가질문: 여기서는 왜 valueOf() 아닌 parseDouble()를 사용했을까?
	//	valueOf()는 내부적으로 parseDouble()을 호출하고, 결과를 Double 객체로 **박싱(wrapping)**합니다.
	//	불필요하게 객체를 만들고, 나중에 다시 언박싱(double로 변환)해야 하므로 성능상 더 느릴 수 있어요.
	//  <참고사항>
	//	Double.parseDouble() -> 문자열을 기본형 double로 변환
	//  Double.parseDouble() -> 문자열을 Double 객체로 변환


	System.out.println("이름:" +  data[0]);
	System.out.println("국어:" + data[1]);
	System.out.println("영어:" + data[2]);
	System.out.println("평균:" + avg);	
	
}//end main()
}//end class
