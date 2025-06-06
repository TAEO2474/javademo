package java004_array;

//[데이터]
//홍길동   90  85 40
//이영희  100  35 75
//
//[출력결과]
//홍길동   90  85 40 215 71.7
//이영희  100  35 75 210 70.0

public class Java047_array {

	public static void main(String[] args) {
		String [] name  = {"홍길동", "이영희"}; // "i"즉 행으로 간주
		int [][] jumsu = {{90,85,40},{100,35,75}};// "j"즉 열으로 간주 // 2차원배열
		
		int sum; // 지역변수(Local variable)
		double avg;
		
		for (int i = 0; i < jumsu.length; i++) {
			sum = 0;
			System.out.printf("%s:", name[i]);// 이름 출력 (홍길동, 이영희)
			for (int j= 0; j< jumsu[i].length; j++) {
				System.out.printf("%4d", jumsu[i][j]); // 홍길동과 이영희의 점수 출력
				sum = sum + jumsu[i][j];//i는 몇 번째 학생인지 //j는 그 학생의 몇 번째 과목인지
			}
			avg = (double) sum/jumsu[i].length; // 강제타입변환 Casting 해소 소수점까지 표시 (sum과 Jumsu 모두 int 정수이기에 강제 형변환 필요)
			System.out.printf("%6d  %.1f\n", sum, avg);// 총점,평균값 출력
		
			} // end for문
		
 	}//end main

}// end class
