package java013_api.part06;
// Character.isLowerCase() : 주어진 문자가 소문자인지 확인 메서드
// Character.isDigit(): 주어진 문자가 숫자인지 확인하는 메서드
public class Java151_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		if(data >='a' && data<='z')
			System.out.println((char)(data-32));
		
		System.out.println(Character.isLowerCase(data)); // 문자가 소문자 입니까?
		System.out.println(Character.toUpperCase(data)); // 대문자로 변경하세요.
		System.out.println(Character.isUpperCase(data)); // 문자가 대문자 입니까?
		System.out.println(Character.toLowerCase(data)); // 소문자로 변경하세요.
		System.out.println(Character.isDigit(data)); // 문자가 숫자입니까?
		System.out.println(Character.isAlphabetic(data)); //문자가 알파벳입니까?

	}

}
