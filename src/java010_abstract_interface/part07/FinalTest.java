package java010_abstract_interface.part07;

public class FinalTest {
	//class final로 선언된 변수는 대문자로 초기값을 할당(저장)해야한다
	final int CooE = 1 ;

	public FinalTest() {
	 // 상수에서  새로룬 값을 할당할 수 없다.
	 //COOE = 2
	}
	void display() {
		System.out.println("FinalTest display()");
	
	}
	
	final void process() {
		System.out.println ("FinalTest process()");
	}
	
}
