package java012_api.part8;
// 오늘의수업 1 : 정규 표현식(Regular Expressions, RegEx)
// 정규 표현식은 문자열 내에서 특정 패턴을 찾거나 비교하는 데 사용됩니다. 
// 이 수업에서는 문자열이 특정 패턴에 맞는지 여부를 판단하기 위해
// Java의 matches() 메서드를 사용한 예제를 다룹니다.
// 오늘의수업 2 : 

import java.util.regex.Matcher;
//실제코딩에서 사용되는 예시로 (비밀번호 유효성 검사: 최소 8자 이상,대문자와 소문자 포함,숫자 포함 등등....)
import java.util.regex.Pattern;

public class Java129_RegEx {
	//a-zA-Z_*$RK sn변수에 포함되어 있으면 true 아니면 false를 리턴한다.
	//[ ]은 OR을 의미한다.
	// . (임의문자), .* (임의문자 여러개, 즉 0개이상 해당 문자가 없거나 여러 번 있을 수 있다)
	public static void main(String[] args) {
		String sn ="12345";
		String st ="aetwef";
		System.out.println(sn.matches(".*[a-zA-Z_*$].*")); //false	
		
		//sn변수에 숫자 0-9가 포함되어 있으면 true, 아니면 false를 의미한다.
		System.out.println(sn.matches(".*[0123456789].*"));//true
		System.out.println(sn.matches(".*[0-9].*"));//true
		System.out.println(sn.matches(".*[\\d].*"));//true
		System.out.println(sn.matches(".*\\d.*"));//true
		
		//sn변수에 숫자 0-9가 포함되어 있지 않으면 true포함되어 있으면, false를 의미한다.
		System.out.println(sn.matches(".*[^0123456789].*"));//false
		System.out.println(sn.matches(".*[^0-9].*")); //false
		System.out.println(sn.matches(".*[\\D].*"));//false
		System.out.println(sn.matches(".*\\D.*"));//false
		
		String sb ="bscba5";
		// sb변수에 저장된 값이 2로 시작하면 true, 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*"));//false
		
		// sb변수에 저장된 값이 2시작되고 5로 끝나면 true, 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*5"));//false
		
		// sb변수에 저장된 값이 'a'이거나'b'로시작하고, 임의문자 5개가 나오며 true, 아니면 false를 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));//true
		
		System.out.println("========= pattern =========");
		
		String input = "3a4bsfa";
		System.out.println(input.matches("\\d")); //false
		
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input);
		
		System.out.println(mc); //java.util.regex.Matcher[patter=\d region=0,7 lastnatch=]
		//  mc.find(): 현재 작업부터(0인덱스부터) 검색을 시작한다. 그래서 처음으로 일치한 3을 리턴한다
		System.out.printf("%b %s\n", mc.find(), mc.group()); //true 3 
		// ->  mc.find()  = 0 인덱스부터 검색을 시작한다. 그래서 처음으로 일치한 3을 리턴한다.
		System.out.printf("%b %s\n", mc.find(0), mc.group()); //true 3
		//-> mc.find(0)  =  1 인덱스부터 검색을 시작한다. 그래서 처음으로 일치한 3을 리턴한다.
		System.out.printf("%b %s\n", mc.find(1), mc.group()); //true 4
		//-> mc.find(1)  = 2 인덱스 검색을 시작한다. 그래서 처음으로 일치한 4을 리턴한다.
		System.out.printf("%b %s\n", mc.find(2), mc.group()); //true 4

//		3인덱스부터는 패턴에서 지정한 데이터가  없기 때문에 Exception 발생한다.		
//		System.out.printf("%b %s\n", mc.find(3), mc.group());
		
		System.out.println("=======================");
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);
		
		
		Pattern ptPattern = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mhMatcher = ptPattern.matcher(str);
			System.out.println(mhMatcher);


		int i = 1;
		while (mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
						}
		
	}

}
