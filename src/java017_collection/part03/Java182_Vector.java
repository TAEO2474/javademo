package java017_collection.part03;
//배열: length 키워드
//
//문자열 : length( )메소드
//컬렉션 : size() 메소드
//
//컬렉션 클래스를 선언하고 생성할 때 제너릭 타입을 선언한다.
//제너릭 타입을 선언하면 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.

import java.util.Vector;

import java.util.Vector;

public class Java182_Vector {

	public static void main(String[] args) {
		// ✅ Vector 선언 및 생성
		Vector<String> v = new Vector<String>();

		v.add("java");
		v.add("jsp");
		v.add("spring");

		// ✅ 출력 구문 오타 수정 (쉼표 → + 로 수정)
		System.out.println("요소의 크기: " + v.size());

		// ✅ 일반 for문
		for (int i = 0; i < v.size(); i++) {
			// 제네릭을 사용했기 때문에 다운캐스팅 필요 없음
			String data = v.get(i);
			System.out.println(data);
		}

		// ✅ 개선된 for문
		//for(데이터변수 : 배열 또는 컬랙션) { 반복할 코드}
		for (String data : v) {
			System.out.println(data);
		}
	}
}

