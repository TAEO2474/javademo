package java018_collection.part04;

import java.util.LinkedList;

//Queue(큐)
//1. FIFO (First In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
//2. 최근 사용문서, 인쇄작업대기목록, 버퍼

public class Java191_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		System.out.println(nQueue.size()); //size: 요소개수 //3
		
//		System.out.println(nQueue.poll());//java
//		System.out.println(nQueue.poll());//jsp
//		System.out.println(nQueue.poll());//spring
//		System.out.println(nQueue.poll());//null
//		
//		System.out.println(nQueue.poll());//null

		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());//spring
		
		System.out.println(nQueue.size());//0
		
	}

}
