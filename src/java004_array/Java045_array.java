package java004_array;

public class Java045_array {

	public static void main(String[] args) {
		//2차원 배열
		
		//3행 2열의 2차원배열 
		int[][] num = new int [3][2]; 
		System.out.printf("num[%d][%d]=%d\t",0,0, num[0][0]);
		System.out.printf("num[%d][%d]=%d\n",0,1, num[0][1]);
		
		System.out.printf("num[%d][%d]=%d\t",1,0, num[1][0]);
		System.out.printf("num[%d][%d]=%d\n",1,1, num[1][1]);
		
		System.out.printf("num[%d][%d]=%d\t",2,0, num[2][0]);
		System.out.printf("num[%d][%d]=%d\n",2,1, num[2][1]);

		System.out.println("====================================");
		num [0][0] = 1; // num 배열 0행 0열 1을 저장
		num [0][1] = 2; // num 배열 0행 1열 2을 저장
		num [1][0] = 3; // num 배열 1행 0열 3을 저장
		num [1][1] = 4; // num 배열 1행 1열 4을 저장
		num [2][0] = 5; // num 배열 2행 0열 5을 저장
		num [2][1] = 6; // num 배열 2행 1열 6을 저장
		
		//num.length : 2차원에서는 배열의 행의 zmrl
		// num [row].length : 2차원에서 배열 row행 번호의 해당 되는열의 크기
//		for (int row=0; row<num.length; row++) {
//			for (int  col = 0; col<num[row].length; col ++) {
//				System.out.printf("num[%d][%d]=%d\t",row,col, num[row][col]);
//			}
//			System.out.println();
//		}
		for (int row=0; row<num.length; row++) {
			for (int  col = 0; col<num[row].length; col ++) {
				System.out.printf("num[%d][%d]=%d",row,col, num[row][col]);
				System.out.printf("%c", col != num[row].length-1? '\t':'\n');
			}
			System.out.println();
		}
	} //end main

}// end class
