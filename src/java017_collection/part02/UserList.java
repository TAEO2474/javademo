package java017_collection.part02;
// 선형리스트( Linear List )

//1 순서 리스트(Ordered List)
//2 자료들 간에 순서를 갖는 리스트
//3 선형 리스트에서 원소를 추가한 순서는 원소들의 순서가 된다.

public class UserList {
	private Object[] sale; // 데이터를 저장할 배열
	private int pointer; // 현재 저장된 요소의 수 (다음 저장 위치) 즉,인스턴스 변수

	// 기본 생성자 (초기 용량 3)
	public UserList() {
		this(3);
	}

	// 매개변수 생성자 (초기 용량 지정)
	public UserList(int cnt) {
		sale = new Object[cnt];
	}

	// append : 요소 추가 (맨 뒤에 추가 = append)
	public void add(Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			// sale 배열의 0번째부터 마지막까지 전부를 arr 배열의 0번째부터 복사한다.
			sale = arr;
		}

		sale[pointer++] = element;
	}

	// insert : 특정 위치에 요소 삽입
	public void add(int index, Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			// sale 배열의 0번째부터 마지막까지 전부를 arr 배열의 0번째부터 복사한다.
			sale = arr;
		}

		for (int i = pointer; i > index; i--) {
			sale[i] = sale[i - 1];
		}
		sale[index] = element;
		pointer++;
	}

	// get : 요소 조회
	public Object get(int index) {
		if( index < pointer)
			return sale[index];
		else
			throw new ArrayIndexOutOfBoundsException(index);
	}

	// remove : 요소 제거
	public Object remove(int index) {
		Object data = sale[index]; // 삭제 대상 데이터를 임시 변수에 저장
		for(int i = index; i<pointer; i++) {
			sale[i] = sale[i+1]; // 삭제된 요소 다음 요소부터 한 칸씩 앞으로 이동
	     } 
	pointer--; // 요소 수 감소
	return data;// 삭제된 요소 반환
	}

	// 배열 요소개수 // 현재 요소 수 반환
	public int size() {
		return pointer;
	}

	// 메모리 크기 (배열길이)
	// 배열의 총 크기 반환 (메모리 용량)
	public int capacity() {
		return sale.length;
	}
}// end class
