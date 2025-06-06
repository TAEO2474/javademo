package ncs.test04_TaeO;
//상품명: 갤럭시 s7
//가격: 563500 원
//수량: 3 개
//총구매 가격 : 1690500 원


public class ProductTest {

	public static void main(String[] args) {
		Product pt1 = new Product("갤럭시 s7",563500,3);
	    
		// public 메소드의자원을 가져다 써야됨으로 getNae메소() 호출.
		  System.out.println("상품명: " + pt1.getName());
	        System.out.println("가격: " + pt1.getPrice() + " 원");
	        System.out.println("수량: " + pt1.getQuantity() + " 개");

	        int total = pt1.getPrice() * pt1.getQuantity();
	        System.out.println("총구매 가격 : " + total + " 원");
	}
}
