package java004_array;

public class Java046_array {
//num[0][0]=1		num[0][1]=2	
//num[1][0]=3		num[1][1]=4	
//num[2][0]=5		num[2][1]=6	
//============================================
//num[0][0]=1	num[1][0]=3	num[2][0]=5
//num[0][1]=2	num[1][1]=4	num[2][1]=6
	
	public static void main(String[] args) {
		// 3행 2열 배열
		int[][] num = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
		// 1. 가로 방향으로 출력 (행 우선)
		for (int row = 0; row < num.length; row++) {//행
			for (int col = 0; col < num[row].length; col++) {//열
				System.out.printf("num[%d][%d]=%d\t", row, col, num[row][col]);
				System.out.printf("%c", col != num[row].length - 1 ? '\t' : '\n');
			}
		}
		System.out.println("============================================");
		// 2. 세로 방향으로 출력 (열 우선)
		for( int col = 0; col<2; col++) {
			for (int row = 0; row < num.length; row++) {
				System.out.printf("num[%d][%d]=%d", row, col, num[row][col]);
				System.out.printf("%c", row != num.length - 1 ? '\t' : '\n');
			}
		}
		
	} // end
}// end
