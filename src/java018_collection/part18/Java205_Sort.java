package java018_collection.part18;
//오늘의 수업: 사용자 정의 정렬 (Comparator 인터페이스 활용)
//Comparator<T> 인터페이스를 사용하여 객체 리스트를 사용자 기준대로 정렬하는 법을 익힌다.
//compare() 메서드 오버라이딩을 통해 이름 기준 정렬 + 나이 기준 정렬을 동시에 처리하는 방법을 학습한다.
//ArrayList.sort() 메서드와 사용자 정의 Comparator 객체를 연결하여 사용하는 법을 익힌다
import java.util.ArrayList;

public class Java205_Sort {

	public static void main(String[] args) {
		ArrayList<Person> ts = new ArrayList<Person>();
		ts.add(new Person("홍길동", 40));
		ts.add(new Person("가비", 20));
		ts.add(new Person("가비", 30));
		ts.add(new Person("나비", 15));

		ts.sort(new NameAgeSort());
		for(Person ps : ts)
			System.out.println(ps.toString());

	}

}
