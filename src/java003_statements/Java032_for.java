package java003_statements;
//이중 for문(반복문 안에 반복문) 구조는 컴퓨터가 표처럼 생긴 데이터를 다룰 때 정말 많이 사용돼요.
//1   2   3   4   5
//
//1   2   3   4   5
//
//1   2   3   4   5
//
//1   2   3   4   5

public class Java032_for {

	public static void main(String[] args) {
//		for(int i = 1; i<=12; i++) {
//			System.out.printf("%4d",i);
//			if (i%4 ==0) {//여기 "{" 생략가능
//				System.out.println("\n"); //\n 줄바꿈
//			}
//		}
//		 
		int data =1;
		for (int row =1; row <=3; row++) { // 행
			for (int col =1; col <=4; col++) {// 열
			
				//System.out.printf("%4d",data);
				//data=data +1;
				System.out.printf("%4d",data++);//++data 변경해서 출력값 비교해보기
			}
			System.out.println("\n");
	
		}
		
	} //end main

} //end class
