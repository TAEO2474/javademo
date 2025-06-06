package java010_abstract_interface.part03;
// 악기  추상클래스 생성 
// 공통점: 연주하다 
public  abstract class Instrument {
	String name;

	public Instrument() {

	}
	
	public Instrument(String name) {
		this.name = name;
	}
	
	public abstract void play() ;
}
