package java010_abstract_interface.part02;

public class Ract extends Shape { // 자식클라스 

	public Ract() {
		
	}
	public Ract (int width, int height) { //2 (20, 20)값 저장
		super(width,height);//3 (20,20)
	}

	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}
}
