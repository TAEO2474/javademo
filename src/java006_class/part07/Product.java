package java006_class.part07;
//this : 메모리에 생성된 객체 자신을 의미한다.
//1. this.멤버변수
//2. this.메소드()
//3. this( ) :생성자

//📌 핵심 요약
//this는 현재 객체를 참조할 때 사용됩니다.this.name = name; 
//this(...)는 같은 클래스의 다른 생성자를 호출할 때 사용됩니다.
//this.변수, this.메소드() 등은 명확한 코드 작성을 도와줍니다

public class Product {
	////상품 코드, 상품 이름, 수량을 저장하는 필드
	String code; //(멤버변수)
	String pname; // (멤버변수)
	int cnt; // (멤버변수)
	
	//생성자 1: 기본 생성자
	public Product() { //2
		this("b001", "식품", 2000); //3 (멤버변수)
		System.out.println("매개변수가 없는 생성자"); //9
	} //10
	
	//생성자 2: 매개변수 있는 생성자
	public Product(String code, String pname, int cnt) { //4  (매개변수)
		//this.code라고 해서 "현재 객체의 멤버 변수" 임을 명확하게 합니다.
		//이 경우 code = code;처럼 쓰면 매개변수만 참조하게 되고, 멤버변수는 바뀌지 않습니다.
		this.code = code; //5
		this.pname = pname; //6
		this.cnt = cnt;  //7
	}  //8
	
	// 메서드 1: display() - 출력
	void display() { //14
	}
	//메서드 2: process() -display() 메서드를 호출 , 참고로 this는 생략 가능하지만 명확한 의미 전달을 위해 사용됨.
	void process() { //12
		this.display();  //13
	} //17
}// end class


