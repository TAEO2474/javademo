package java003_statements;

public class Java034_for {
// 2개의 주사위를 던졌을때  합계가 5가 되는 경우의 수를 구하시오.
//(1,4),(2,3),(3,2),(4,1)

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) { // { 생략가능
			for (int j = 1; j <= 6; j++) {// { 생략가능
				if (i + j == 5)
					System.out.printf("(%d,%d)\n", i, j);
			}// { 생략가능
		}

	} // end main

}// end class
