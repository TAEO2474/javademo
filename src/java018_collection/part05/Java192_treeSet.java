package java018_collection.part05;

import java.util.Iterator;
import java.util.TreeSet;
// TreeSet은 자바에서 제공하는 정렬된 Set 컬렉션입니다.
public class Java192_treeSet {

	public static void main(String[] args) {
	// Tree(오름차순 정렬), Set(중복안됨)
	TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(300);
		tree.add(100);
		tree.add(200);
		
	System.out.println(tree.size()); //3
	for(int it: tree)
		System.out.println(it);
	System.out.println(tree.size()); //3
	
	System.out.println("===========Iterator=============");
	Iterator<Integer> ita = tree.iterator();
	while(ita.hasNext())
		System.out.println(ita.next());
	
	System.out.println("===========내림차순=============");
	Iterator<Integer> decita = tree.descendingIterator();
	while(decita.hasNext())
		System.out.println(decita.next());
	
	System.out.println("=================================");
	System.out.println(tree.first());
	System.out.println(tree.size()); 
	
	System.out.println(tree.pollFirst());
	System.out.println(tree.size()); 
	
	System.out.println(tree.last()); 
	System.out.println(tree.size());
	
	System.out.println(tree.pollLast());
	System.out.println(tree.size()); 
	
	
	
	
	}

}
