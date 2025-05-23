package java014_api.part01;

import java.util.Calendar;

// 수능일: 2025-11-13
// 오늘 : 2025-5-20 (코드 실행 기준 날짜)
// 남은일: 177 (예상 출력)

public class Java157_Calendar {
	public static void main(String[] args) {

		// 1. 수능 날짜 설정 (2025년 11월 13일)
		Calendar examDay = Calendar.getInstance(); // 현재 날짜 기준 Calendar 객체 생성, 즉 GregorianCalendar(Calendar의 자식클래스) 생성 
		int examDay_year = 2025;
		int examDay_month = 11;   // 월은 0부터 시작하므로 11월이면 10을 넣어야 함 //12월(December)
		int examDay_date = 13;

		// 수능 날짜로 설정
		examDay.set(examDay_year, examDay_month - 1, examDay_date); // 2025-10-13로 설정됨
		System.out.println("수능일: " + examDay);

		// 2. 오늘 날짜 설정
		Calendar toDay = Calendar.getInstance(); // 현재 날짜

		// 시간, 분, 초를 0으로 초기화해서 '날짜 비교'에만 집중 (시간 차이 제거 목적)
		toDay.set(Calendar.HOUR, 0);
		toDay.set(Calendar.MINUTE, 0);
		toDay.set(Calendar.SECOND, 0);
		toDay.set(Calendar.MILLISECOND, 0); // 💡 밀리초도 0으로 초기화하면 정확도 높음

		System.out.println("오늘: " + toDay);

		// 3. 밀리초로 변환 (1970년 1월 1일 00:00:00 기준부터의 누적 밀리초)
		long eventDay = examDay.getTimeInMillis(); // 수능일의 밀리초 값
		long nowDay = toDay.getTimeInMillis();     // 오늘 날짜의 밀리초 값

		System.out.println("수능일(ms): " + eventDay);
		System.out.println("오늘(ms): " + nowDay);

		// 하루는 몇 밀리초? (1초 = 1000ms, 1분 = 60초, 1시간 = 60분, 1일 = 24시간)
		System.out.println("하루(ms): " + (60 * 60 * 24 * 1000));

		// 4. 남은 일 수 계산
		// 수능일까지 남은 밀리초 차이 / 하루 밀리초 = 남은 날짜 수
		long endDay = (eventDay - nowDay) / (60 * 60 * 24 * 1000);
		System.out.println("수능일까지 남은 일 수: " + endDay);
	}
}
