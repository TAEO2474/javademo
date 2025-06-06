package java009_inheritance.part08;

public class Java100_inheritance {

	public static void main(String[] args) {
		OwnerEngine oEngine = new OwnerEngine();// 첫번째 객체 생성 (스택메모리 생성시작)
		System.out.println(oEngine.toString());
		oEngine.setSpeed(100);
		oEngine.color = "Blue";		
		oEngine.setSeat(4);
		System.out.println(oEngine.toString());
		
		FireEngine fireEngine = new FireEngine();// 두번째 객체 생성 (스택메모리 생성시작)
		System.out.println(fireEngine.toString());
		fireEngine.color="Red";
		fireEngine.setSpeed(150);
		fireEngine.setWater(10000);
		System.out.println(fireEngine.toString());

	}//end main()

}//end class
