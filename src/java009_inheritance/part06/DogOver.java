package java009_inheritance.part06;

public class DogOver extends PetOver {
	// 기본 생성자 
	public DogOver() {
		
	}
	
	// 오버라이드 move 매소드 (함수, 결과값 출력 장소)
	@Override
	public void move() {
		System.out.println("서브클라스() : 강아지가 걸어갑니다.");
	}
}
