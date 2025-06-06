package java009_inheritance.part04;

public class Parent {
	String name;
	int age;
	int salary;
	
	// 기본생성자 
	public Parent() {
	
	}
	// 매개변수를 가진 생성자
	public Parent(String name, int age,int salary) {
		this.name  = name;
		this.age  = age;
		this.salary = salary;
	}
}
