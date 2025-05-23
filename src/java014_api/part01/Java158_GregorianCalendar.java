package java014_api.part01;
//isLeapYear() : 해당 연도가 윤년(Leap Year)인지 확인해주는 메서드
//결과는 true 또는 false인 논리값(boolean) 을 반환해요.

import java.util.GregorianCalendar;

public class Java158_GregorianCalendar {

	public static void main(String[] args) {
		int year = 2024;
		GregorianCalendar gre = new GregorianCalendar();
		System.out.println(gre);
		
		// boolean isLeapYear(year) ? true : false; (참고: is~ has~ 들어가면 논리값 구하는 매소드임)
		String chk = gre.isLeapYear(year) ? "윤년" : "평년";
		System.out.printf("%d년도는 %s입니다.\n", year, chk);
	}

}
