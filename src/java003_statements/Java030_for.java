package java003_statements;
//1~10까지 짝수, 홀수 누적을 계산하는 프로그램
//
//[출력결과]
//홀수누적:25
//짝수누적:30
public class Java030_for {

	public static void main(String[] args) {
		int oddsum = 0; // 홀수누적
		int evensum = 0; // 짝수누적
		
	   for (int i =1; i <= 10; i++) {
		   if (i%2==1) {
			   oddsum = oddsum + i;
		   } else {
			   evensum = evensum + i;
		   }
		
	   }
	   System.out.printf("홀수누적:%d\n", oddsum);
	   System.out.printf("짝수누적:%d\n", evensum);
	}

}
