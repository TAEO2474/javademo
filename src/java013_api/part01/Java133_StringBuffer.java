package java013_api.part01;
//java.lang.String : immutable(불변)
//java.lang.StringBuffer : mutable(가변), 동기화
//java.lang.StringBuilder: mutable(가변), 비동기화
//
// StringBuffer 클래스란?
// StringBuffer는 문자열을 수정할 수 있는 클래스입니다. String 클래스와 달리, 
// StringBuffer는 문자열을 변경할 수 있기 때문에 성능 면에서 효율적입니다. 
// 주로 반복적인 문자열 변경이 필요할 때 사용됩니다.

// StringBuffer 특징
//1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
//2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.

public class Java133_StringBuffer {

	public static void main(String[] args) {
		String ss = new String("java test java");
		String ss1 = ss.replace("java", "jsp");
		System.out.println("ss:"+ss); //ss:java test java
		System.out.println("ss1:"+ss1); //ss1:jsp test jsp
		
		System.out.println(System.identityHashCode(ss)); //258952499
		System.out.println(System.identityHashCode(ss1)); //603742814
	
		StringBuffer zz = new StringBuffer("spring test"); 
		// replace(int start, int end, String str)
		// 7인데스 ~11인덱스 미만 사이의 문자열을 "framework"로 변경한다.
		StringBuffer zz1 = zz.replace(7, 11,"framework");
		
		System.out.println("zz:"+zz);//zz:spring framework
		System.out.println("zz1:"+zz1);//zz1:spring framework
		System.out.println(zz == zz1);//true
//		System.out.println(System.identityHashCode(zz)); /1067040082
		System.out.println(System.identityHashCode(zz1));//1067040082
	}

}
