package java004_array;

//int[][] num = new int[][] {{1,2},{3,4,5},{6,7,8,9,10}};
//
//
//char[][] color = { { 'r', 'e', 'd' }, 
//				           { 'g', 'r', 'e', 'e', 'n' }, 
//				           { 'p', 'i', 'n', 'k' } };

//출력값
//red
//green
//pink

//출력값
//Red
//reen
//pink
//-> A:65 a:97 (소문자-> 대문자 = -32)
public class Java053_array {

	public static void main(String[] args) {
		// 가변 배열(char 배열) 선언 및 초기화
		char[][] color = {
			{ 'r', 'e', 'd' },             // color[0] = "red"
			{ 'g', 'r', 'e', 'e', 'n' },   // color[1] = "green"
			{ 'p', 'i', 'n', 'k' }         // color[2] = "pink"
		};

		// 배열 전체 출력
		for (int row = 0; row < color.length; row++) { // 행 반복
			for (int col = 0; col < color[row].length; col++) { // 열 반복
				// 삼항 연산자 사용:
				// 만약 현재 열(col)이 0이라면 (첫 글자) → 대문자로 변환
				// 아니면 그대로 출력
				System.out.printf("%c", col == 0 ? (char)(color[row][col] - 32) : color[row][col]);
			}
			System.out.println(); // 줄바꿈
		}			
	}
}