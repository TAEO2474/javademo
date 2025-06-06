package java009_inheritance.prob__TaeO;

public class ClassTest_2_taeo extends ClassTest_1_taeo{
	
	 String department;

	  
	  public void callSuperThis() {
		  super.prn();		
		  System.out.println("서브클래스");
	}
	  
	  public ClassTest_2_taeo (String name, int salary, String department) {
		  super (name, salary);
		  this.department = department;
	}
	  
	    @Override
	    public void getInformation() {
	        System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + department);
	    }
	}

	
	
