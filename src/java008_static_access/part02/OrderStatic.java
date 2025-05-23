package java008_static_access.part02;
//<JVM이 메모리에 올리고 실행하는 순서,클래스 안에서의 정의 순서> 
// class 클래스명()
// 1. 멤버변수
// 2. static(){}
// 3. 생성자(){}  - void 없음
// 4. 메소드 () {}

public class OrderStatic {
//  1.멤버변수
int x; // 객체 멤버변수
static int y; // 클래스 멤버변수

//  2. static
static { // 무조건 첫번째 한번 수행이 됨.
	y = 5;
	System.out.println("static");
	System.out.println("y=" + y);
}

//  3. 생성자
public OrderStatic() { //()
	x = 10;
	System.out.println("constructor");
	System.out.println("x=" + x);
}
//  4. 메소드
public void display() {
	System.out.println("display");
	process();
}

public static void process() {
	System.out.println("static method");
	System.out.println("display method");
	//display()메소드는 생성(new)한 다음에 method area에 바이트코드가 저장된다.
	// process()메소는 OrderStatic 클래스는 loader하는 시점에 method area에 바이트코드가 저장된다.
	//process()메소드가 method area에 저장되는 시점이 display()보다 빠르다.
	//display();
	
}

}// end class

