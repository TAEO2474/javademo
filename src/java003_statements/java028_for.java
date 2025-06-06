package java003_statements;
// i=1
// i=2
// i=3
// i=4
// i=5
// sum =15
public class java028_for {

	public static void main(String[] args) {
		// 누적된 값이 최초로 15이상일 때 까지만 반복문을 수행
		int sum = 0;
		int i;
		
		for (i = 1 ; ; i++) {// ;; 안에 조건시기 없을 경우 무한으로 수가 돌아간다. 그러기에 IF로 지정해줘야함)
			//sum = sum + i; 또는 sum += i;
			sum += i;
			System.out.printf("i=%d\n", i); // 과정의 값을 보기 위에서 이 위치에
			if (sum>=15) { 
				break; // break를 사용함으로 for문을 강제적으로 탈출
			}
			// System.out.printf("i=%d, sum=%d\n", i, sum); 결과값만 보고 싶을 경우는 이 위치에 
		}
		System.out.printf("sum=%d\n", sum);
	}//end main

}//end class
