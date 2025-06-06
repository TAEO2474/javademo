package java004_array;
//참조 타입 (Reference Type)

//값이 아닌 데이터 주소(레퍼런스)를 저장하는 타입이에요.
//예: String, 배열, 클래스, 인터페이스 등
//실제 데이터는 다른 곳에 저장되고, 그 주소만 저장하는 형태입니다

public class Java039_array {

	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;

		int[] arr; // int[] 배열 선언
		// new 키워드를 이용해서 배열 생성.
		// 각요소 (element 

		arr = new int[3];
		// int[] arr = new int[3]
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;

		System.out.printf("arr[0]=%d\n", arr[0]);
		System.out.printf("arr[1]=%d\n", arr[1]);
		System.out.printf("arr[2]=%d\n", arr[2]);
		
		System.out.println("배열의 크기:"+arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}

	} // end main
} // end class
