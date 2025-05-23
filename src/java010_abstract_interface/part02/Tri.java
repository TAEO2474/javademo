package java010_abstract_interface.part02;

public class Tri extends Shape {//

	public Tri() {
	}
	
	public Tri (int width, int height) { 
		super(width,height);
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight() / (double) 2;
		//return getWidth() * getHeight() * 0.5; 다른예시
		// getWidth() * getHeight() * (double)1/2;
	}

}
