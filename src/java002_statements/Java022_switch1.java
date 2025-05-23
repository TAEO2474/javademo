package java002_statements;
//30 : 4, 6, 9, 11

//31 : 1, 3, 5, 7, 8, 10, 12
//28 or 29 : 2

// 윤년조건
// 첫번째 조건 : 년도를 4로 나누어서 나머지가 0이되고, 년도를 100으로 나누어서 나머지가 0이 되면 안된다.
// 두번째 조건 : 년도를 400으로 나누어서 나머지가 0이면 된다.
// 위 2개의 조건 중 1개만 충족하면 된다.

public class Java022_switch1 {

	public static void main(String[] args) {
		int year = 2024; //년도
		int month =15; // 월
		int lastDay; // 마지막일 
		
		if (month >= 1 && month <=12) {

			switch(month) {
			case 1: 
			case 5: 
			case 7:  
			case 8: 
			case 10: 
			case 12: lastDay=31;break;
			
			
			case 4: 
			case 6: 
			case 9: 
			case 11: lastDay=30;break;
			
			default: lastDay=28;break;
			}
			System.out.printf("%d년도 %d월의 마지막달은 %d 입니다\n", year, month,lastDay);

		} else {
			System.out.println("잘못 설정하셨습니다 1월 ~ 12월 중에 설정해주세요");
			
			
			
	}

}
}
