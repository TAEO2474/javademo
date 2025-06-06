package java012_api.part2;

public class Java116_object {
//Object에서 제공된 equals()메소드 객체만 비교가 가능하다.
//Object에서 제공된 equals()메소드 메모리 주소를 비교한다.
// 즉, Object에서 상속받은 equals() 메서드는 기본적으로 '두 객체의 메모리 주소(참조값)'를 비교한다.

	public static void main(String[] args) {
		
		Value v1 = new Value (10);
		Value v2 = new Value (10);
		System.out.println(v1.toString());//java012_api.part2.Value@7a81197d
		System.out.println(v2.toString());//java012_api.part2.Value@5ca881b5

		System.out.println(v1==v2);//false
		System.out.println(v1.equals(v2));//false
		
		System.out.println("====================");
		Member m1 = new Member(10);// 
		Member m2 = new Member(10);
		// ? Member class와 Member class 간의 비교-> 메모리주소 비교
		// ? 참조변수간 (int,byte...) 의 비교는 -> 변수 값을 비교
		System.out.println(m1);//java012_api.part2.Member@4517d9a3
		System.out.println(m2);//java012_api.part2.Member@372f7a8d
		
		System.out.println(m1==m2);//false
		System.out.println(m1.equals(m2));//true
		
		System.out.println("====================");
		String s1 = new String("java");
		String s2 = new String("java");
		
		//toString(): 메모리에 저장된 문자열 리턴하도록 오버라이딩
		System.out.println(s1);//java
		System.out.println(s2.toString());//java
		
		//메모리주소
		System.out.println(s1==s2);//false
		// 메모리에 저장된 문자열을 비교해서 리턴하도록 오버라이딩 해줌.
		System.out.println(s1.equals(s2));//true
		
		String s3 = new String("jsp");
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//false
		
	}

}
