package java013_api.part02;
// StringTokenizer란?
// StringTokenizer는 자바에서 문자열을 **구분자(delimiter)**를 기준으로
// **분리(토큰화)**할 때 사용하는 클래스입니다.
// 보통 문자열을 특정 기준(예: 공백, 콤마 ,, 하이픈 - 등)으로 나누고 싶을 때 사용합니다.
import java.util.StringTokenizer;

public class Java136_StringTokenizer {

	public static void main(String[] args) {

		// StringTokenizer("문자열", "구분자");
		// 문자열의 구분자가 공백일때는 2번째 파라미터값은 생략 할 수 있다.
		// StringTokenizer("java jsp");
		StringTokenizer st = new StringTokenizer("java_jsp", "_");
		System.out.println(st.countTokens());// 2
		// 메모리에 저장된 "java"문자열 가져오면서 메모리에 저장된 "java" 문자열 메모리를 삭제한다.
		System.out.println(st.nextToken());// java
		System.out.println(st.countTokens());// 1
		System.out.println(st.nextToken());// jsp
		System.out.println(st.countTokens());// 0
		// System.out.println(st.nextToken());//java.util.NoSuchElementException

		System.out.println("============countTokens()==============");
		st = new StringTokenizer("java_jap");
		int count = st.countTokens();
		for (int i = 0; i < count; i++);
		System.out.println(st.nextToken());//java_jap
		
		
		System.out.println("============hasmoreTokens()==============");
		st = new StringTokenizer("java_jap");
		// hasmoreTokens()은 메모리에 저장된 토큰이 있으면 true, 아니면 false.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
