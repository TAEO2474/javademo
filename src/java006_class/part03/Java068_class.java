package java006_class.part03;

public class Java068_class {

	public static void main(String[] args) {
		Rect rt = new Rect();
		rt.width = 5;
		rt.height = 3;
		rt.color = "레드";
		
		Rect rt1 = new Rect();
		rt1.width  = 7;
		rt1.height = 4;
		rt1.color = "블루";
		
		rt.display();
		rt1.display();
		
//		System.out.printf("%d %d %s %d %d\n", rt.width, rt.height, rt.color, rt.area(), rt.grith());
//		System.out.printf("%d %d\n", rt.width, rt.height);
//		System.out.printf("%d %s\n", rt.width, rt.color);
//		
		
	
		
	}
}
