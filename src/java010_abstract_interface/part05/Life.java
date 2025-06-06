package java010_abstract_interface.part05;

// extends ~~~~implements 첫번째인터페이스명, 두번째인터페이스명
// implement : 인터페이스 SampleA, SampleB에서 Life 클래스로 상속
// extends : 부모클래스에서 자식클래스로 상속 
public final class Life extends Animal implements SampleA, SampleB {

	public Life() {
		
	}

	@Override
	public void call() {
		System.out.println("call");
		
	}

	@Override
	public void prn() {
		System.out.println("prn");
		
	}

	
	
}
