package java006_class.part07;

public class Java072_this {
	public static void main(String[] args) {
		Product pt1 = new Product("s001", "공산품", 4000);
		//pt1.display();
		pt1.process();
		
		Product pt2 = new Product(); //1
		pt2.process(); //11
		
	} // end main()
}// end class

