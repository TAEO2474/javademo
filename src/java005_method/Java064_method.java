package java005_method;
//[출력결과]
//java test
//tset avaj
//java test

public class Java064_method {
public static void main(String[] args) {
	char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
	System.out.println(arr);  // 출력결과 java test
	System.out.println(reverse(arr));// 출력결과 tset avaj
	System.out.println(arr);
}//end main()

public static char[] reverse(char[] data) {// 출력결과 tset avaj
	// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
	char[] temp = new char[data.length]; // 의미 : data 즉 arr값의 크기(8개)만큼 새로운 배열을 만들겠다
	for (int i = 0; i < data.length; i++) {
		temp[i] =data[data.length-1-i]; // 
	}                                         

	return temp ;
}//end reverse()
}//end class
