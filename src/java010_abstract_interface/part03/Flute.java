package java010_abstract_interface.part03;
// 플롯 자식 클래스 01
public class Flute  extends Instrument{
	public Flute() {
	
	}
	
	public Flute(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("입으로 분다.");		
	}
}
