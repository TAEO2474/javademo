package java006_class.part02;

public class Book {
	String title;
	boolean state; // 대출가능: true, 대출중: false
	
	String process() {
		if(state) {
			return "대출가능";
		}else {
			return "대출증";
		}
		
	}//end process()
	
	void display() {
		System.out.printf("%s, %s\n", title, process());
		}
	}
