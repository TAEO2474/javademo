package java009_inheritance.prob.part02;

public class StudentExam extends Human {
    String snumber;
	public StudentExam() {
		
	}
	
	public StudentExam (String name, int age, int height, int weight, String snumber) {
		  super (name, age,height,weight);
		  this.snumber = snumber;
		  
		
	}
	

}
