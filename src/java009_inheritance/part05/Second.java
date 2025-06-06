package java009_inheritance.part05;

public class Second extends First {
	int b = 20;

	// 기본 생성자
	public Second() {
		//super();
	}
// <point>	
// 부모클래스의 메소드 접근제어자가 protected이므로
// 자식클래스의 메소드 접근제어자는 protected 또는 public이 가능하다.

	// 오버라이드 + display() 메소드
	@Override
	public void display() {
		System.out.println("b=" + b);
	}

	// 오버라이드 + toString() 매소드
	@Override
	public String toString() {
		return String.format("a=%d, b=%d", a, b);
	}
	
	public void superThisMethood() {
		super.display();//->class first display 호출 ("a="+ a)
		this.display(); //->class Second display 호츌 ("b=" + b)
		
	}

} // end class
