package java012_api.part8;
/*
 * 정규화 표현식(Regular Expression)
 * 1 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
 *    찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
 *    작성한 문자열을 말한다.    
 */
public class Java128_RegEx {
 public static void main(String[] args) {
	String sn = "java korea";
	String sg = "";

	// a 또는 r 이면 '_'로 변경
	for (int i = 0; i < sn.length(); i++) {
		char data = sn.charAt(i);
		if (data == 'a' || data == 'r') {
			sg += "_";
		} else {
			sg += data; // sg = sg + data;
		}
	}
	 System.out.println(sg);
	 System.out.println("===========Regular Expression========을 이용한 문자 변경");
	//[]대괄호는 Or을 의미한다. 
	// . : 임의문자 하나
	// * : 0개의 이상 
	 
	// sn변수에 저장된 문자열을 a이거나 r이면 "_"로 변경한다.
	System.out.println(sn.replaceAll("[ar]", "_"));
	System.out.println(sn);

	// sn변수에 저장된 문자열이 a 이거나 r로 끝나면 true를 리턴하고 아니면 false을 리턴한다.
	System.out.println(sn.matches(".*[ar]"));

	// sn변수에 저장된 문자열이 a 이거나 r로 시작하면 true를 리턴하고 아니면 false을 리턴한다.
	System.out.println(sn.matches("[ar].*"));
			
	// sn변수에 저장된 문자열에서 a 이거나 r이 포함되여 있으면 true를 리턴하고 아니면 false을 리턴한다.
	System.out.println(sn.matches(".*[ar].*"));

	String st ="java@@@@korea";
	// st변수에 저장된 문자열에서 "@"개수가 2이상 3이하이면 "_"로 대체한다.
	// @{2,3}: 연속된 @ 문자가 2개 이상 3개 이하인 부분을 찾아서 그 부분을 _로 교체합니다
	String sa = st.replaceAll("@{2,3}", "_");
	System.out.println(sa);	//java_@korea
	
	// st변수에 저장된 문자열에서 "@"개수가 2이면, "_"로 대체한다.
	sa = st.replaceAll("@{2}", "_");
	System.out.println(sa);	//java__korea
	
	// st변수에 저장된 문자열에서 "@"개수가 2이상이면, "_"로 대체한다.
	sa = st.replaceAll("@{2,}", "_");
	System.out.println(sa);	//java_korea
	
	String[] line = st.split("@{1,}");
	for (int i=0; i< line.length; i++) {
		System.out.printf("line[%d]=%s\n",i,line[i]);
	}
	//[출력]
	//line[0]=java
	//line[1]=korea
	
	String sp = "java  jsp oracle     mybatis";
	String[] arr =  sp.split("\\s{1,}");
	for(int i =0; i<arr.length; i++) {
		System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
	//[출력]
	//arr[0]=java
	//arr[1]=jsp
	//arr[2]=oracle
	//arr[3]=mybatis
	}
	 
 }
