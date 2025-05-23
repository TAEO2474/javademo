package java012_api.part4;
//💡 clone() 메소드
//•	Object 클래스에 정의된 clone() 메소드는 객체의 복사본을 만드는 기능을 해.
//•	하지만 그냥 사용하면 에러가 나. 왜냐하면 Cloneable 인터페이스를 implements 해야만 clone()이 제대로 작동함.
//•	즉, implements Cloneable + super.clone() 조합이 기본 패턴이야.

//자바에서 배열이나 클래스처럼 **참조형 데이터(reference type)**는 변수에 실제 값이 아닌 **객체가 저장된 메모리 주소(참조값)**를 저장해.


public class Address implements Cloneable {
    String city;
    String dong;
    
	public Address() {
	
	}
	
	public Address(String city,String dong) {
		this.city=city;
		this.dong=dong;	
	}
	
	// Address deepCopy를 해줌
	public Address clone() {
		Address address = null;
		 try {
			address = (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
			return address;
	}
	

}
