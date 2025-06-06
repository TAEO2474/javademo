package java012_api.part6;

public class Java121_String {

	public static void main(String[] args) { 
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이:" + str.length()); // 문자열 길이:14
		System.out.println("대문자:" + str.toUpperCase());// 대문자:KOREA,JSP,JAVA
		System.out.println("소문자:" + str.toLowerCase());// 소문자:korea,jsp,java
		System.out.println("문자:" + str.charAt(0));// 문자:K (0번째 인덱스 값 가져오겠다)
		System.out.println("문자:" + str.charAt(5));// 문자:,

		// str.indexOf()
		System.out.println("인덱스:" + str.indexOf('a'));// 인덱스:4 (유닛코드로 찾음)
		System.out.println("인덱스:" + str.indexOf(97));// 인덱스:4
		System.out.println("인덱스:" + str.indexOf('a', 5));// 인덱스:11 인덱스5 시작 위치 → 인덱스 5번부터 검색 시작
		System.out.println("인덱스:" + str.indexOf(97, 5));// 인덱스:11

		System.out.println("인덱스:" + str.indexOf("JSP"));// 인덱스:-1
		System.out.println("인덱스:" + str.indexOf("JSP", 7));// 인덱스:-1 "검색문자열이 없으면 -1을 리턴한다

		// [5] index ~ 마지막 index까지 문자열 리턴.
		System.out.println("범위:" + str.substring(5));// 범위:,jsp,java
		// [2] index ~ [8]미만 index까지 문자열 리턴.
		System.out.println("범위:" + str.substring(2, 8));// 범위:REa,js

		// 메모리 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(","); // KoREa,jsp,java
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]=%s\n", i, arr[i]);// arr[0]=KoREa,arr[1]=jsp,arr[2]=java

		int x = 10;
		int y = 20;
		System.out.printf("x=%d, y=%d, x+y=%d\n", x, y, x + y);// x=10, y=20, x+y=30
		
		//valueOf() : 기본 데이터 타입(숫자, 문자 등)을 문자열(String)으로 바꿔주는 정적 메소드
		String s1 = String.valueOf(x); // static 정적매소드이기에 class.~ 이렇게 사용
		String s2 = String.valueOf(y);
		System.out.printf("s1+s2=%s\n", s1 + s2);// s1 (10) + s2(20)=1020

		char[] data = { '1', '2', '3', '4', '5' };
		String s3 = String.valueOf(data); 
		System.out.printf("s3=%s\n", s3);// s3=12345
		

        //valueOf(char[] data, int offset, int count)
		// valueOf(문자 배열, 시작 인덱스 (어디서부터 잘라올지),글자를 잘라올지 (갯수))
		//에러발생:  Exception in thread "main" java.lang.StringIndexOutOfBoundsException: offset 2, count 8, length 5
		String s4 = String.valueOf(data, 2, 3); //만약 8입력시 에러발생  "2번 인덱스부터 시작해서 3개를 문자열로 만든다"
		System.out.printf("s4=%s\n", s4);//s4=345
		
		

	}
}
