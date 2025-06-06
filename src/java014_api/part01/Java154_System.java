package java014_api.part01;
// 오늘의 수업 내용: 시간 계산, 현재 시간 출력, 날짜 포맷 변환
//https://docs.oracle.com/javase/8/docs/api/ (접속해서 한번 확인해보기)
import java.text.SimpleDateFormat;

public class Java154_System {

	public static void main(String[] args) {
		// 하루의 초를 계산하면,"하루느 86400초"입니다
		// 60초 * 60분 * 24시간 = 86400초
		System.out.println(60*60*24);// 86400
		
		//currentTimeMillis() : 1970.01.01부터 ~ 초단위로
		// 누적한 값을 [밀리세컨드]로 리턴한다.
		// 밀리초(millisecond, js)는 1000분의 1초(1/1000)를 의미한다
		long curr = System.currentTimeMillis();//여기서 curr은 long 타입
		System.out.println(curr);
		
		//HH:24시간, hh:12시간, mm:분
		// a: 오전/ 오후
		// EEEE: 금요일 ,  EEE: 금
		// MM: 월 
		String pattern = "yyyy-MM-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// long -> Long -> Object(최상클래스)
		//자동 형변환(오토 박싱 & 업캐스팅)
		String dateTime = sdf.format(curr); // 여기서 curr은 long 타입
		System.out.println(dateTime);

	}//end main

}// end class
