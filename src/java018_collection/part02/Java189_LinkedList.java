package java018_collection.part02;
// 제네릭(Generic) 클래스의 역할
// 어떤 타입의 데이터를 저장하거나 처리할지, 사용자가 직접 지정할 수 있도록 하는 것

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Java189_LinkedList {

	public static void main(String[] args) {
		System.out.println("========ArrayList============");
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		
		ListIterator<String> ank = aList.listIterator();
		System.out.println("앞 -> 뒤");
		while(ank.hasNext())
			System.out.println(ank.next());

		System.out.println("앞 -> 뒤");
		while(ank.hasPrevious())
			System.out.println(ank.previous());
		
		System.out.println("==========LinkedList==================");
		LinkedList<String> aNode = new LinkedList<String>();
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		
		ank = aNode.listIterator();
		System.out.println("앞->뒤");
		while(ank.hasNext())
		   System.out.println(ank.next());	
		
		System.out.println("뒤->앞");
		while(ank.hasPrevious())
		  System.out.println(ank.previous());

	}

}
