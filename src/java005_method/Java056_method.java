package java005_method;

public class Java056_method {
	public static void main(String[] args) {  //1
		int year = 2025; // 년도              //2
		boolean chk = isLeapYear(year);     //3  8
		display(year, chk);                 //9
	} // end main()              //14
	public static void display(int year, boolean chk) {  //10
		if (chk)  { //11
			System.out.printf("%d년도는 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년도는 평년입니다.\n", year);  //12
		}
	} // end display()  //13
	public static boolean isLeapYear(int year) {  //4
		// 년도가 윤년이면 true, 평년이면 false로 리턴하는 프로그램 구현
		// boolean res;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //5
			// res = true;
			return true;
		} else {
			// res = false;
			return false;   //6
		}
		// return res;
	} // end isLeapYear()    //7
} // end class

