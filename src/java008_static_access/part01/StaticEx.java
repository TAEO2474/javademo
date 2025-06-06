package java008_static_access.part01;

public class StaticEx {
	int x = 5; // // 인스턴스 변수 : 객체마다 따로 존재하는 변수
	static int y =10; // 클래스(static) 변수 :모든 객체가 공유하는 하나의 변수 (공용)
	
	public String toString() {
		return String.format("x=%2d, yx=%2d", x, y);
	}
	
}
