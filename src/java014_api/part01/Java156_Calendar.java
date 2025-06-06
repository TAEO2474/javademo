package java014_api.part01;
// GregorianCalendar(Calendar의 자식클래스) :자바에서 사용하는 기본 달력 시스템 클래스입니다. 양력(그레고리력, 서양식 달력) 기반이에요.
import java.util.Calendar;

public class Java156_Calendar {

	public static void main(String[] args) {
		// 현재 날짜와 시간 정보를 포함한 Calendar 객체 생성
		Calendar cal = Calendar.getInstance();  //GregorianCalendar(자식클래스) 실제로 생성
												// Calendar(부모클래스) 안에 GregorianCalendar(자식클래스)를 리턴
		// 현재 년도, 월, 일 얻기
		int year = cal.get(Calendar.YEAR);               // 예: 2025
		int month = cal.get(Calendar.MONTH) + 1;         // 월은 0부터 시작하므로 +1 필요
		int date = cal.get(Calendar.DATE);               // 오늘 날짜

		// 현재 월의 '마지막 날짜'를 구함 (예: 5월이면 31)
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println("마지막 날짜: " + lastDate);

		// Calendar 객체의 날짜를 해당 월의 마지막 날짜로 설정
		cal.set(Calendar.DATE, lastDate);

		// 설정된 날짜의 요일을 구함 (1=일요일, 2=월요일, ..., 7=토요일)
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("마지막 날짜의 요일(숫자): " + weekday);

		// 요일 숫자를 한글 요일 문자로 변환
		char weekName = ' ';

		switch (weekday) {
		case 1:
			weekName = '일';
			break;
		case 2:
			weekName = '월';
			break;
		case 3:
			weekName = '화';
			break;
		case 4:
			weekName = '수';
			break;
		case 5:
			weekName = '목';
			break;
		case 6:
			weekName = '금';
			break;
		case 7:
			weekName = '토';
			break;
		}

		// 결과 출력: 예) 2025-5-31 토
		System.out.printf("%d-%d-%d %s\n", year, month, lastDate, weekName);
	}
}
