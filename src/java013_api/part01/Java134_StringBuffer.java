package java013_api.part01;

public class Java134_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		System.out.println(sb);
		System.out.println(sb.toString());
		//4인덱스부터 "jsp"문자열을 삽입한다.
		sb.insert(4, "jsp");
		System.out.println(sb);  //javajsp test
		
		//4인덱스부터 7인덱스미만 사이의 문자열을 삭제한다.
		sb.delete(4, 7);
		System.out.println(sb);  //java test
		
		//문자열을 앞뒤순서를 변경한다.
		sb.reverse();
		System.out.println(sb);  //tset avaj
		
		//String -> StringBuffer -> String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);//mro sitabym
		String ss = sf.toString();
		System.out.println(ss); //mro sitabym
		
		//Char[] = StringBuffer
		char[] arr = {'k','o','r','e','a'}; 
		// String ss = new String(arr); -생략 가능
		//StringBuffersk= new StringBuffer(ss);-생략 가능
		StringBuffer sk = new StringBuffer(new String(arr));
		System.out.println(sk.reverse()); //aerok
		
		StringBuffer se = new StringBuffer (String.valueOf(arr));
		System.out.println(se.reverse());//aerok
		
		// StringBuffer -> String -> char[]
		String sp = se.toString();
		char[] val = sp.toCharArray();
		System.out.println(val);//aerok
		
		System.out.println(se.toString().toCharArray());//aerok
		
		
	}//end main()
	
}//end class
