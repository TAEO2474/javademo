package java006_class.part08;

public class Employees {
	String name;
	String dept;
	int salary;
	
	public Employees(int salary) {
		this.salary  = salary;
	}
	// 매개변수의 타입과 갯수를 가지고 구분하므로 string 타입이 1개인 생성자가 2개 이면 단된다.
	// Public Employees (string dept) {
	//    this.dept  = dept;
	//  }
	
	//  오버로딩: 같은 이름의 메서드나 생성자를 매개변수(parameter)의 타입이나 개수에 따라 여러 개 정의하는 것을 말합니다. 
	// 즉, 하나의 이름으로 다양한 방식으로 호출될 수 있게 만드는 것입니다.당신이 제시한 코드에서 오버로딩의 예는 생성자 오버로딩입니다:

	public Employees(String name) {
		this("보류", 30000); // 주의 :생성자 호출 먼저
		this.name  = name;
	}
	
	public Employees(String dept,int salary) { // 중요 : 타입지정 (string 문자열/int 정수)
		this.dept  = dept;
		this.salary = salary;
	}

	public Employees(String name, String dept, int salary) {
		this.name  = name;
		this.dept  = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d", name, dept, salary);
	}
}
