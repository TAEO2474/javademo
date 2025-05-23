package java003_statements;
/*
 * while(조건식){
 *    반복 수행 문장;
 * }
 * 
 * while문은 조건식을 생략할 수 없다.
 */

// while :반복 횟수가 불확실하거나 조건에 따라 바뀔 때 -> 언제 끝날지 몰라도, 조건을 보고 반복할 때
// while (조건) { ... }
// for:반복 횟수가 명확할 때 사용함	-> 몇 번 반복할지 미리 알 때 (ex: 5번 반복)
// for (int i=1; i<=5; i++) { ... }
public class Java036_while {

	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) 
//		System.out.println(i);
//	}
//	
		int i = 1;
		while(i<=5) {
			//System.out.println(i);
			System.out.println(i++);
	
		}
	} //end main
} //end class
