package java006_class.part06;
//생성자(constructor)
//1. 객체 멤버변수에 초기값 할당
//2. 생성자명은 클래스명하고 같다.
//3. 생성자는 클래스에서 1개 이상 존재한다.
//4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
//[기본 생성자]
//- 클래스의 접근제어자하고 같고 파라미티가 없는 구조이다.
//  public HandPhone( ){}
//- 클래스에 정의된 생성자가 존재하면 기본 생성자는 JVM에서 제공하지 않는다.
//
//Java에서는 오버로딩을 지원하므로 이름을 같은 여러개의 생성자를 정의할 수 있다.

public class HandPhone {// 클래스안에서 하나의 생성자가 꼭 필요 !
	String name;
	String number;
// 기본생성자를 습관적으로 하나 만들어 놓기.
	public HandPhone() { // 오버로딩: 같은 이름의 메서드나 생성자를 매개변수(parameter)의 타입이나 개수에 따라 여러 개 정의하는 것을 말합니다. 즉, 하나의 이름으로 다양한 방식으로 호출될 수 있게 만드는 것입니다.당신이 제시한 코드에서 오버로딩의 예는 생성자 오버로딩입니다:
	}
	
	public HandPhone(String  a, String b) {
	 name = a;
	 number = b;
	}
	void display() {
		System.out.printf("%s %s\n", name, number);
	}

}
