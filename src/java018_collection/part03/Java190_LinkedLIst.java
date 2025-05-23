package java018_collection.part03;

import java.util.LinkedList;

//stack(스택)
//1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
//2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로

public class Java190_LinkedLIst {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		nStack.push(new String("java")); // 스택의경우 [2]
		nStack.push(new String("jsp")); // 스택의경우 [1]
		nStack.push(new String("spring"));// 스택의경우 [0]
		
//		System.out.println(nStack.get(2));
//		System.out.println(nStack.size());//요소의 개수 3개 //3
//		
//		System.out.println(nStack.pop());//spring
//		System.out.println(nStack.pop());//jsp
//		System.out.println(nStack.pop());//java
//		
//		System.out.println(nStack.pop());// 에러 (nStackd에서 더이상 꺼내올게 없음)
		
		while(!nStack.isEmpty()) // 스택 안에 요소가 하나라도 존재할 때 조건문이 실행됩니다.
			System.out.println(nStack.pop());//spring
		System.out.println(nStack.size());//0
 	
	}

}
