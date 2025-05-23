package java013_api.part03;

public class Java138_Math {

// Math클래스의 모든 멤버변수, 메소드는 static이 선언되어 있다.
// Math.멤버변수
// Math.메소드()

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);

		// 0.0이상 ~1.0미만
		// System.out.println(Math.random());

		double de = Math.random();// 0.0이상 ~1.0미만
		System.out.println(de);

		de = de * 10;// 0.0이상 ~9.999999...까지
		System.out.println(de);
		
		//floor() 소수점 이하는 무조건 버림
		System.out.println(Math.floor(de));//0.0부터 ~ 9.0까지
		
		//int로 자료형 변환 
		System.out.println((int)Math.floor(de));//0부터 9까지
		System.out.println((int)Math.floor(de)+1);//1부터 10까지
		
		System.out.println((int)Math.floor(Math.random()*10)+1);
		
	}
}
