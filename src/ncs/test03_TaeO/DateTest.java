package ncs.test03_TaeO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//생일 : 1987년 5월 27일 수요일
//현재 : 2016년 4월 18일
//나이 : 29 세
public class DateTest {

	public static void main(String[] args) {
		 GregorianCalendar BirthOfTaeo = new GregorianCalendar(1987, 5, 27); 
		 // GregorianCalendar클래스는 object 조상클래스안에 있는  
		 // 자기 내부의 중요한 정보들을 전부 문자열로 바꿔서 말해 toString() 메소드가 기본적으로 Overriding 되었기 떄문에
		 // 자기 내부 상태가 전부 출력된다. java.util.GregorianCalendar[time=?,areFieldsSe................
		 // 그래서 우리가 원하는 방식대로 예쁘게 정리해줄 SimpleDateFormat 클래스가 필요하다
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE"); //1987, 5, 27
		 // SimpleDateFormat클래스의 Format()메소드는 Date 객체를 사용자가 지정한대로 날짜를 예쁘게 출력할 수 있도록 스타일링 해주는 메서드

		 
		 System.out.printf("생일 : %s\n", sdf.format(BirthOfTaeo.getTime()));
		 //GregorianCalendar 클래 안에 는 getTime(): 진짜 날짜와 시간을 Date 객체로 변환해 주는 메서드
/////////////////////////////////////////////////////////////////////////////////////////////////////////		 
		 
		 GregorianCalendar today = new GregorianCalendar(2016, 3, 18); 
		 // GregorianCalendar 경0인덱스부터 월이 시작 0월=1
		 // 오늘날짜 객체 생성
		 SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
		 //날짜 포펫 객체 생성 
		 System.out.println("현재 : " + sdf1.format(today.getTime()));
		 // 현재 날짜  출력 
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////		 
		 
		 int age = today.get(Calendar.YEAR) - BirthOfTaeo.get(Calendar.YEAR);// 2016-1987 =29

	        // 생일이 아직 안 지났다면 나이 -1
	        if (today.get(Calendar.MONTH) < BirthOfTaeo.get(Calendar.MONTH) || // 4월 < 6월  true
	            (today.get(Calendar.MONTH) == BirthOfTaeo.get(Calendar.MONTH) && // 4월 = 6월 false  (true)
	             today.get(Calendar.DAY_OF_MONTH) < BirthOfTaeo.get(Calendar.DAY_OF_MONTH))) {//18일 <27일 (true)
	            age--; // 결론은 true이기떄문에   -1 빼주기! 
	        }

	        System.out.println("나이 : " + age + " 세");
	    }
		 
	
		 
	}


