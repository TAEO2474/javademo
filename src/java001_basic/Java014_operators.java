package java001_basic;

public class Java014_operators {

	public static void main(String[] args) {
		int total  = 23;// 사과
		int record = 5; // 한바구니 5개씩 담기 
		// total % record == 0 식이 true 이면  total/record 계산에서  res 계산후  변수에 할당한다.
		//total % record == 0 식이 false 이면  total/record + 1 계산에서  res계산 후  변수에 할당한다.
		 
		int res = total % record == 0 ? total/record : total/record + 1;
		System.out.println(res);
		
		
		int jumsu = 81;
		// JUMSU >= 80 : 상, JUMSU < 80 && JUMSU >= 60: 중, JUMSU < 60 :하 
		
		char check =  jumsu >= 80 ? '상':jumsu >= 60 ? '중':'하';
		//char check = jumsu>=80?'상':'다음식';
		//다음식 = jumsu >=60?'중':'하'
		// a=  jumsu >= 80 참이면 상 거짓이면 b
		// b=  jumsu >= 80 ? '상':jumsu >= 60 참이면 중 거짓이면 하
			
		System.out.println(check);
		
		check =  jumsu >= 60 ? jumsu >= 80 ? '상':'중':'하';
		// 상 100-80
		// 중 79-60
		// 하 59-0
		System.out.println(check);
		 

	}

}
