package java012_api.part8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java130_RegEx {

	public static void main(String[] args) {
		String phone = "016-253-5243";
		System.out.println(phone.matches("01(1|6|9)-[0-9]{3,4}-[0-9]{4}"));//true
		//01로 시작하고, 그 뒤에 1, 6, 또는 9 중 하나가 와야 한다는 의미입니다.
		// 하이픈(-) 다음에 3자리 또는 4자리 숫자가 와야 한다는 의미입니다.
		//또 다른 하이픈(-) 뒤에 정확히 4자리 숫자가 와야 한다는 의미입니다.
		System.out.println(phone.matches("01(1|6|9)-[\\d]{3,4}-[\\d]{4}"));//true
		//[\\d]는 숫자(0-9)와 동일하며, {3,4}는 3자리 또는 4자리 숫자를 의미합니다.
		
		Pattern pt = Pattern.compile("01(1|6|9)-[0-9]{3,4}-[0-9]{4}");
		Matcher mt = pt.matcher(phone);
		
		while(mt.find(0)) {
			// group () 메소드는 find() 실행후 사용한다
			//find()는 Matcher 객체에서 다음 일치 항목을 찾는 메서드입니다.
			//group()은 find() 메서드를 통해 일치한 부분을 가져오는 메서드입니다.
			System.out.println(mt.group());
		}	
	}
}
//group() 메서드와 find() 메서드의 관계는 정규 표현식을 사용하여 텍스트에서 일치하는 부분을 찾고, 
//그 결과를 추출하는 방식에서 중요한 역할을 합니다. 
//이를 잘 이해하면 정규 표현식으로 텍스트를 검사하고 원하는 부분을 추출하는 데 유용합니다.

