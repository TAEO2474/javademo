package ncs.test05_TaeO;

import java004_array.prob.Taeo;

// Book 객체를 3개 생성하여 배열에 넣는다.
// 배열에 있는 객체 정보를 모두 getter 로 출력 한다. – for 문을 이용 할 것
// 실행 결과와 같이 계산 출력

//자바의 정석, 남궁성, 도우출판, 30000, 10할인
//할인된 가격:27000원
//열혈강의자바, 구정은, 프리렉, 29000, 10할인
//할인된 가격:26100원
//객체지향 Java8, 금영욱, 북스홈, 30000, 10할인
//할인된 가격:27000원

	public class BookArray {
		public static void main(String args[]) {
		Book bArray [] = new Book[3];
		
		 bArray[0] = new Book("자바의 정석", "남궁성", "도우출판", 30000, "10할인");
	     bArray[1] = new Book("열혈강의자바", "구정은", "프리렉", 29000, "10할인");
	     bArray[2] = new Book("객체지향 Java8", "금영욱", "북스홈", 30000, "10할인");
	        
		
		
	   for (Book b : bArray) {
	            System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getPublisher() + ", " + b.getPrice() + ", " + b.getDiscount());
	            
	            // 할인된 가격 계산 (10% 할인 가정)
	            int discountPercent = 10; // 여기선 그냥 일단 10할인으로 고정!
	            int discountedPrice = b.getPrice() * (100 - discountPercent) / 100; //“정가 × (100 - 할인율) ÷ 100”
	            System.out.println("할인된 가격: " + discountedPrice + "원");
		}
		
	}
}


