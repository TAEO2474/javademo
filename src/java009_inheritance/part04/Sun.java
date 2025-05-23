package java009_inheritance.part04;

public class Sun extends Parent {
	String dept;
    // 기본 생성자 
	public Sun() {
		super();
	}
    //매개변수를 가진 생성자 (변수를 넣는 장소)
	public Sun(String name, int age, String dept, int salary) {
		super(name, age, salary); // 부모 생성자의 값들이 상속됨
		this.dept = dept;
	}

	// 매소드(함수를 넣는 장소)
	public String toString() {
		return String.format("%s %d %s %d", name, age, dept,salary);
	}

}
