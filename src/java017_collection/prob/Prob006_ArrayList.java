package java017_collection.prob;

import java.util.ArrayList;
import java.util.regex.Matcher;
/*
 * [프로그램 실행결과]
 * 
 * 주가종목 : 삼성전자
 * 현재가격 : 10000
 * 등락가격 : 2000
 * 
 * 주가종목 : NAVER
 * 현재가격 : 7000
 * 등락가격 : 2500
 */
import java.util.regex.Pattern;

public class Prob006_ArrayList {

	public static void main(String[] args) {
		ArrayList<Kospi> aList = new ArrayList<Kospi>();
		aList.add(new Kospi("삼성전자", 10000, "상승가[2000]"));
		aList.add(new Kospi("현대차", 8000, "하락가[-1000]"));
		aList.add(new Kospi("POSCO", 8500, "보합[0]"));
		aList.add(new Kospi("NAVER", 7000, "상승가[2500]"));
		prnDisplay(aList);
	}// end main()
	
///////////////////// 아래 매소드로 이동하세요 ////////////////////////////////
	public static void prnDisplay(ArrayList<Kospi> aList) {
	Pattern pattern = Pattern.compile("\\d+");
	for (Kospi kp : aList) {
		if (kp.getFluctuation().contains("상승")) {
			System.out.printf("주가종목:%s\n", kp.getStock());
			System.out.printf("현재가격:%d\n", kp.getPrice());
			// 개선된 for문 해석
			//"aList에 있는 각 객체를 Kospi 클래스의 getFluctuation() 메서드를 통해 확인한 후,
			//'상승'이라는 문자열을 포함하고 있다면,
			//해당 종목의 주식명, 현재 가격을 System.out.printf() 형식에 맞춰 출력하라 .		
			
			Matcher matcher = pattern.matcher(kp.getFluctuation());
			if (matcher.find())
				System.out.printf("등락가격:%s\n", matcher.group(0));

			
		 }
	 }

	}// end prnDispaly()
//////////////////////// 클래스를 종료합니다 ///////////////////////////////	
}// end class
