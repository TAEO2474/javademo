package java018_collection.part11;

public class Java198_User {

	public static void main(String[] args) {
		Integer[] it = new Integer[] { 1, 5, 3, 2 };

		Average<Integer> av = new Average<Integer>(it);

		Number[] nb = new Number[] { 2, 2.5f, 4.5, 10L };
		Average<Number> ae = new Average<Number>(nb);
		System.out.println(ae.findAverage());

		// 오류발생 :Bound mismatch: The type String is not a valid substitute for the
		// bounded parameter <T extends Number> of the type Average<T>
		// 오류해석: Average<T> 클래스는 제네릭 타입 T를 Number 클래스 또는 그 하위 클래스로 제한하고 있는데,
		// 너가 T 자리에 String을 넣으려고 해서 타입 제한(bound)을 위반했다
		// Average<String> sn = null;
	}

}
