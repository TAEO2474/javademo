package java006_class.part04;

public class Java069_class {

	public static void main(String[] args) {
		MenuShop m1 = new MenuShop();
		m1.menu = "떡볶이";
		m1.price = 2000;
		m1.cnt = 3;
		m1.display();
		System.out.println("-------------------");
		
		MenuShop m2 = new MenuShop();
		m2.menu = "순대";
		m2.price = 3500;
		m2.cnt = 2;
		m2.display();
		System.out.println("-------------------");
		
		MenuShop m3 = new MenuShop();
		m3.menu = "피카츄돈까스";
		m3.price = 1000;
		m3.cnt = 2;
		m3.display();
		System.out.println("-------------------");
		int total = m1.count()+ m2.count() + m3.count();
	    System.out.println("총 주문금액:"+ total);	
	}

}
