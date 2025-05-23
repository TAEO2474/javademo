package java018_collection.part11;
//제네릭(Generic) 클래스에서 타입 제한(Bounded Type) 을 설정하는 문법
public class Average <T extends Number> {//T는 Number 클래스를 상속받은 클래스만 사용할 수 있다
	private T[] list; //list는 타입이 T인 요소들을 담는 배열이고, private으로 선언되어 있어 클래스 내부에서만 접근 가능
	
	public Average() {
		
	}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for (T data : list)
			sum += data.doubleValue();
		return sum/list.length;
		
	}

	
}//end class
 