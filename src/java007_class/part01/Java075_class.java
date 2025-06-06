package java007_class.part01;

public class Java075_class {

	public static void main(String[] args) {
//	 Goods g1 = new Goods ("Nikon",400000, 30, 50);
//	 System.out.println(g1.toString());
//	 
//	 Goods g2 = new Goods ("Sony",450000, 20, 35);
//	 System.out.println(g2.toString());
//	 
//	 Goods g3 = new Goods ("Fuji",350000, 10, 25);
//	 System.out.println(g3.toString());

		Goods[] goods = new Goods[3];
		goods[0] = new Goods("Nikon", 400000, 30, 50);
		goods[1] = new Goods("Sony",450000, 20, 35);
		goods[2] = new Goods("Fuji",350000, 10, 25);
//		첫번째 출력방법 
//		System.out.println(goods[0].toString());
//		System.out.println(goods[1].toString());
//		System.out.println(goods[2].toString());
		
//		두번째 출력방법 (for 반복문을 활용하는 방법)
//		for (int i = 0; i < goods.length; i++) { // 
//			System.out.println(goods[i].toString());
//		}
		
	 process(goods); //
	 
	} //end main
	
	public static void process(Goods[] goods) {
		for (int i = 0; i < goods.length; i++) { 
			System.out.println(goods[i].toString());
		}
		
	
	} //end process
}// end class
