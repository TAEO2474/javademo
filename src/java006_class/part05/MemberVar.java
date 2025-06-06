package java006_class.part05;
//멤버변수의 초기값을 생성자를 통해서 전달하지 않으면 JVM에서 멤버변수에 기본값을 할당한다.
//<용어 정리>
//* 멤버변수: 클래스 안에 선언된 변수 (객체가 가지는 속성)
//* 생성자: 객체를 만들 때 멤버변수를 초기화하는 특별한 메서드
//* JVM 기본값: 생성자를 사용하지 않아도 자바가 자동으로 넣어주는 값

public class MemberVar {
//멤버변수는 기본값을 제공한다.(JVM)
	byte var_byte; //0
	short var_short;//0
	int var_int;//0
	long var_long; //0L
	
	float var_float; //0.0f
	double var_double; //0.0
	
	boolean var_boolean;//false
	char var_char;//\u0000
	
	String var_str; // null
	int[] var_arr; //null
}

