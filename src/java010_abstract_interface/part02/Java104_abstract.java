package java010_abstract_interface.part02;

public class Java104_abstract {

	public static void main(String[] args) {
		Ract rect = new Ract (10, 20);//1
		System.out.println("사각형 넓이:" + rect.getArea());
		
		Tri tri = new Tri (10,20);
		System.out.println("삼각형 넓이:" + tri.getArea());
	}

}
