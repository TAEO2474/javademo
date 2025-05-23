package java009_inheritance.prob__TaeO;

public class ClassTest_1_taeo {
	private String name;
	private int salary;
	
	public ClassTest_1_taeo() {
		
	}

	ClassTest_1_taeo(String n, int s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		System.out.println("이름:" + name + " 연봉:" + salary);
	}

	public void prn() {
		System.out.println("수퍼클래스");
	}
} // end ClassTest_1



