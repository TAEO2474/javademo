package java003_statements;

public class Java026_for {

	public static void main(String[] args) {
		// 누적된 값이 최초로 15이상일 때 까지만 반복문을 수행
		int sum = 0;
		int i;
		
		for (i = 1 ; ; i++) {
			sum = sum + i;
			if (sum>=15) { 
				break; // break를 사용함으로 for문을 강제적으로 탈출
			}

		}
		
		System.out.printf("i=%d, sum=%d\n", i, sum);
	}

}
