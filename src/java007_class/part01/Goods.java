package java007_class.part01;

public class Goods {
	String name; // 상품명
	int price;// 가격
	int numberOfStock;// 상품제고
	int sold; // 팔린수량

	public Goods() { // 여기 놓고 마우스 오른쪽 "Source" -> Generate constructor using flied.
		
	}

	public Goods(String name, int price, int numberOfStock, int sold) {
		super();
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
		
	public String toString() {
	 return String.format ("%-14s %-10d %5d %5d", name, price, numberOfStock, sold); 
	 // -14왼쪽 정렬, 문자포함해서 14칸공백
	}
}
