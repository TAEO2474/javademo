package java009_inheritance.part06;

public class Java098_inheritance {

	public static void main(String[] args) {
		PetOver pet = new PetOver();
		pet.move();//의미:PetOver클래스에서 move메소드 호출!
		
		DogOver dog = new DogOver();
		dog.move();//의미: DogOver클래스에서 move메소드 호출!
		
		BirdOver bird = new BirdOver();
		bird.move();//의미: BirdOver클래스에서 move메소드 호출!
		
		
	}

}
