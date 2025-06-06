package ncs.test07_TaeO;

public class Human {
	private String name;
    private int age;
    private int height;
    private int weight;
    
    public Human() {
    }

	public Human(String name, int age, int height, int weight) {
	
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// protected로 하면 자식 클래스에서 직접 접근 가능
    protected String getHumanInfo() {
        return name + "\t" + age + "\t" + height + "\t" + weight;
    }

    
}
    

