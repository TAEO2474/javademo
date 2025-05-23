package java012_api.part7;

import java.util.StringJoiner;

//java.lang.String join() 과 java.util.stringJoiner
public class Java127_String {

	public static void main(String[] args) {
		String color = "red,geen,blue";
		String[] arr = color.split(",");
		String str = String.join("-", arr);
		System.out.println(str);// red-geen-blue
		System.out.println(color);// red,geen,blue

		StringJoiner sj = new StringJoiner(",", "[", "]");
		for (String data : arr)
			sj.add(data);
		System.out.println(sj);// [red,geen,blue]
		System.out.println(sj.length());// 15
	}

}
