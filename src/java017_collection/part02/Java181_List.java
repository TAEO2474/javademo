package java017_collection.part02;

import java.util.Iterator;

public class Java181_List {

	public static void main(String[] args) {
		UserList us = new UserList();
		// append
		us.add(10);
		us.add(20);
		us.add(30);
		us.add(40); // 초기용량이 '3' 그래서 에러발생!

		// insert
		us.add(2, 50);

		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));// 초기용량이 '3' 그래서 에러발생!
		System.out.println(us.get(4));
		System.out.println("=================================");

		System.out.println("삭제요소: " + us.remove(2));
//		System.out.println(us.get(0));
//		System.out.println(us.get(1));
//		System.out.println(us.get(2));
//		System.out.println(us.get(3));

		for (int i = 0; i < us.size(); i++)
			System.out.println(us.get(i));
			
	}

}
