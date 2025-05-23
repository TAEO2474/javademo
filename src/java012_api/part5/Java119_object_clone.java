package java012_api.part5;

import java.util.Arrays;
// 참조 데이터 타입(reference type) 으로 불리게 된 이유는 바로 **"값이 아닌 주소를 저장하고 있기 때문"**입니다.
// toString()은 객체를 사람이 읽을 수 있는 "문자열"로 변환하는 메서드입니다
public class Java119_object_clone {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; // 배열 array (참조데이터)
		int[] copy =arr; 
		System.out.println(arr); //[I@36baf30c -> 이렇게 주소를 복사해서 출력함 
		System.out.println(copy);//[I@36baf30c
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5] 배열 arr 안의 요소들을 문자열로 변환해서 출력하라.
		System.out.println(Arrays.toString(copy));//[1, 2, 3, 4, 5]

		System.out.println("==============================");
		int[] deepCopy = arr.clone(); // 원본 배열을 .clone()으로 복사한 새로운 배열 객체
		deepCopy[0] =10; 
		System.out.println(arr);//[I@36baf30c
		System.out.println(deepCopy);// [I@7a81197d
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(deepCopy));//[10, 2, 3, 4, 5]

	}


}
