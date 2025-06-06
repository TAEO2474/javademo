package java008_static_access.part01;
//static
//1. class loader일때 method area에 저장이 된다.
//2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
//3. static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.
//
//https://velog.io/@jupiter-j/Java-2.-Inheritance-AbstractMethod
 class Java084_static {

	public static void main(String[] args) {
		System.out.printf("StaticEX. y=&d\n", StaticEx.y);
		//System.out.printf("StaticEX. x=&d\n", StaticEx.x);
		//-> StaticEx.x 경우, 'class StaticEx 클래스'에서 그냥 static없이 
		// -> int = 5 ;로만 지정했기에 위에 같이 쓰지 않아서, 주석처리. 
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y%d\n", se.x, se.y);

		StaticEx ss = new StaticEx();
		System.out.printf("se.x=%d, se.y%d\n", ss.x, ss.y); 

		se.x = 20;
		se.y = 50;
		
		System.out.printf("se.x=%d, se.y%d\n", se.x, se.y);
		System.out.printf("se.x=%d, se.y%d\n", ss.x, ss.y);
	}

}
