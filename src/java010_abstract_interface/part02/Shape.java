package java010_abstract_interface.part02;

public abstract class Shape { // 부모클라스
	private int width; //20 값 저장
	private int height; // 20 값 저장

	public Shape() {

	}

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public abstract double getArea();

	
}
	
	
	
    
