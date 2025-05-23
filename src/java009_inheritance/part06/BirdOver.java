package java009_inheritance.part06;

public class BirdOver extends PetOver {
	public BirdOver() {
		
	}
	
	@Override
	public void move() {
		System.out.println("서브클라스() : 새가 닐이갑니다.");

	}
}
