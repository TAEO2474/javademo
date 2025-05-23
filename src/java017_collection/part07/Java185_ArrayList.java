package java017_collection.part07;

import java.util.ArrayList;

public class Java185_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		//process(aList);
	}// end main()
	public static void prnDisplay(ArrayList<String> aList) {
		// aList매개변수의 요소에서 "J" or "j"가 포함되여 있는 요소만
		// 출력하는 프로그램을 구현하세요.
		for(String sn : aList) {
			//대문소 J 또는 소문자 j가 포함되여 있으면?
//			if(sn.contains("J") || sn.contains("j"))
//				System.out.println(sn);
			
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
		}
	}// end prnDisplay()
	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("spring"));
	}// end process()
}// end class
