package java008_static_access.prob.part02;
//-(private)    + (public)    #(protected)     X : default

/*   클래스명 : Sales
*   -item:String  
*   -qty:int
*   -cost:int
*   
*   +setItem(item :String):void
*   +setQty(qty :int):void
*   +setCost(cost :int):void
*   +getItem():String
*   +getQty():int
*   +getCost():int
*   +toString():String         ==> 출력
*   +getPrice():int             ==> 수량 * 단가를 리턴
*/
public class Sales {
	// 1.멤버변수
	private String items;
	private int qty;
	private int cost;
	public int price;

	// 2.기본 생성자
	public Sales() {

	}

	public String toString() {
		return String.format("품목은 : %s 수량: %d 단가:%d 금액 : %d", items, qty, cost, getPrice());
	}

	public int getPrice() { // 요거요거 다시 확인 
		return cost*qty;

	}

	// Getter/Setter 메서드 (private 멤버 변수에 간접적으로 접근 위한)
	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
