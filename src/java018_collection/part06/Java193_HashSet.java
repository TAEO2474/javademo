package java018_collection.part06;
//HashSet (사용잘안함)
//va에서 제공하는 컬렉션 프레임워크 중 하나로, 중복을 허용하지 않는 데이터를 저장할 때 사용됩니다.
//내부적으로는 해시 테이블을 사용하여 데이터를 저장하며, 순서가 보장되지 않습니다.


import java.util.HashSet;

public class Java193_HashSet {
	public static void main(String[] args) {
		
		//HashSet :  중복허영안되고, 순서 유지 안된다.
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		for(int it : set)
			System.out.println(it); //20 10 30
		
		
	}//end main()
}//end class
