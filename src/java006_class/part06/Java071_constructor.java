package java006_class.part06;

public class Java071_constructor {

	public static void main(String[] args) {
		HandPhone hp1 = new HandPhone();
		hp1.name ="홍길동";
		hp1.number ="010-1111-2474";
		
		HandPhone hp2 = new HandPhone("김영희","010-2222-2474");
		hp2.display();
	}
}

