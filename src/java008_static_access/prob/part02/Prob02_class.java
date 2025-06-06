package java008_static_access.prob.part02;

/*
 * 품목 : apple 수량 : 5 단가 : 1200원 금액 : 6000원
 *
 * apple 1200원 짜리 5개 구입하면 6000원이 필요함
 */



public class Prob02_class {
	public static void main(String[] args) {
		Sales ss = new Sales(); // ss 객체(object) 생성
		 ss.setItems("apple"); 
		 ss.setQty(5); 
		 ss.setCost(1200);
		 
		  
		 System.out.println(ss.toString());
		  	  
		 System.out.println( 
				 ss.getItems() + "  " + ss.getCost() + "원짜리 " + ss.getQty()+ "개 구입하면 " + ss.getPrice() + "원이 필요함");
		 
	}// end main()
}// end class Prob02_class
