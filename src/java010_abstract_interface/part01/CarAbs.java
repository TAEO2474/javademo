package java010_abstract_interface.part01;
//<중요한점>
// 추상메소드만을 가지고 객체(new)생성 불가능
//CarAbs  car = new CarAbs ();  

// 추상클래스
public abstract class CarAbs  {
	int speed;
	String color;
	
	//추상 메소드
	public abstract void work(); 
	
	//구현된 메소드
	public void display() {
		System.out.printf("speed=%d, color=%s\n", speed, color);
	}

}
