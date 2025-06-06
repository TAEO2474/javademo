package java009_inheritance.answ.part01;

public class ClassTest_2 extends ClassTest_1{
String department;
	           //이지나, 3000, 교육부 
	ClassTest_2(String name, int salary, String department){
		super(name,salary);
		this.department=department;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름:%s 연봉:%d 부서:%s\n",getName(),getSalary(),department);
	}
	
	@Override // 상속 관계에서 부모클래스(class 1)의 메서드를 자식 클래스에서 재정의하는 것
	public void prn() {
		System.out.println("서브클래스");
	}
	
	
	public void callSuperThis(){ 
		super.prn();
		this.prn();
	}		
}
