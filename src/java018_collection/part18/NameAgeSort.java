package java018_collection.part18;

import java.util.Comparator;

public class NameAgeSort implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().equals(o2.getName())) {
			// 이름이 같으면 나이 내림차순 정렬
			return Integer.compare(o2.getAge(), o1.getAge());
		} else {
			// 이름 오름차순 정렬
			return o1.getName().compareTo(o2.getName());
		}
	}
}

