package ncs.test07_TaeO;

public class Student extends Human {
    
	
    private String number;  // 학번
    private String maijor;// 학번
    
    Student(){
    	
    }

    public Student(String name, int age, int height, int weight, String number, String major) {
        super(name, age, height, weight);
        this.number = number;
        this.maijor = major;
    }

    @Override
    public String toString() {
        return getHumanInfo() + "\t" + number + "\t" + maijor;
    }
} 