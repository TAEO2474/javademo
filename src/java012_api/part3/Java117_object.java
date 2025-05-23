package java012_api.part3;
//Object의 hashCode( )메소드는 객체의 메모리 주소를 이용해서
//해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴한다.

public class Java117_object {

 public static void main(String[] args) {
	 Person  p1 = new Person ("홍길동");
	 Person  p2 = new Person ("홍길동");
	 
	 System.out.println(p1);//java012_api.part3.Person@7a81197d
	 System.out.println(p2);//java012_api.part3.Person@5ca881b5

	 System.out.println(p1.hashCode());//2055281021
	 // hashcode() 메소드는 16진수 값(7a81197d)을
	 //10진수(2055281021)로 리턴해주는 값이다
	 
	 System.out.println(p2.hashCode());//1554547125
	 
	 ///////////////////////////////////////////////////////////////
	 //*정적 메서드(static method)**
	 System.out.println(System.identityHashCode(p1));//2055281021
	 System.out.println(System.identityHashCode(p2));//1554547125
	
}

}
