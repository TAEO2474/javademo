package java010_abstract_interface.part04;

interface CarRun {
	int carCount = 5 ; // 인터페이스에서 상수를 무조건 사용. 즉, 5값은 변경 불가능
	                   // public static final

//	static CarRun () {} -> 사용불가
//	static {}	 -> 사용불가
	
	void prn(); //public abstract 앞에 생략됨
	
	class Sun {
		public Sun() {
			System.out.println("Sun construcotr");
		}
	}
		
	//JAVA 8부터 default 사용 가능함.	
	default void call() {
		System.out.println("CarRun call");
	}
	
	//JAVA 8부터 static 사용 가능함.
	static void display() {
		System.out.println("display");
	}
	
	
	
}// end interface
