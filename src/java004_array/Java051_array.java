package java004_array;

//[출력결과]
//1  *  3  *  5 -> '*'위치는 홀수 자리  (이유, 행열 모두 0부터 시작하기에)
//6  *  8  * 10
//11 * 13  * 15
//16 * 18  * 20
//핵심내용
//num.length → 전체 행의 수
//num[i].length → i번째 행의 열의 수
public class Java051_array {

	public static void main(String[] args) {
		// 2차원 배열 선언 및 초기화 (4행 5열 구조)
		int[][] num = {
			{ 1, 2, 3, 4, 5 }, 
			{ 6, 7, 8, 9, 10 }, 
			{ 11, 12, 13, 14, 15 },
			{ 16, 17, 18, 19, 20 }
		};

		// 행 반복
		for (int row = 0; row < num.length; row++) { //num.length → 전체 행의 수
			// 열 반복
			for (int col = 0; col < num[row].length; col++) { //num[i].length → i번째 행의 열의 수
				// 열의 인덱스가 홀수일 경우 '*' 출력
				if (col % 2 == 1) { 
					System.out.printf("%4c", '*');
				} else {
					// 열의 인덱스가 짝수일 경우 배열 값 출력
					System.out.printf("%4d", num[row][col]);
				}
			}
			// 각 행 출력 후 줄 바꿈
			System.out.println();
		}
	}
}