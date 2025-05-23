package java014_api.part02;
// [출력값]    1   5   2   4   6   3   9   7   8   4   2
public class Java159_SystemArrayCopy{

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 2 ,4}; // 첫 번째 배열
        int[] arr2 = { 6, 3, 9, 7, 8 }; // 두 번째 배열
        int[] arr3 = { 4, 2 }; // 세 번째 배열

        // process() 메서드를 호출하여 세 배열을 하나의 배열로 합친다.
        int[] arr4 = process(arr1, arr2, arr3);

        // 합쳐진 배열을 출력
        for (int data : arr4)
            System.out.printf("%4d", data);

    }// end main()

    // 세 개의 배열을 하나로 합치는 메서드
    public static int[] process(int[] arr1, int[] arr2, int[] arr3) {
        // 결과를 저장할 배열의 크기를 구함
        int[] data = new int[arr1.length + arr2.length + arr3.length];
        
        // 첫 번째 배열(arr1)을 data 배열의 첫 번째 위치부터 복사
        // arr1의 모든 요소를 data 배열의 맨 앞(0번 인덱스)부터 복사한다.
        // 예: arr1[0] → data[0], arr1[1] → data[1], ..., arr1[n] → data[n]
        System.arraycopy(arr1, 0, data, 0, arr1.length);

        // 두 번째 배열(arr2)을 data 배열의 arr1.length 번째 위치부터 복사
        // arr2의 모든 요소를 data 배열의 arr1이 끝난 다음 위치(arr1.length)부터 복사한다.
        // 예: arr2[0] → data[arr1.length], arr2[1] → data[arr1.length + 1], ...
        System.arraycopy(arr2, 0, data, arr1.length, arr2.length);

        // 세 번째 배열(arr3)을 data 배열의 arr1.length + arr2.length 번째 위치부터 복사
        // arr3의 모든 요소를 data 배열의 arr1.length + arr2.length가 끝난 위치부터 복사한다.
        // 예: arr3[0] → data[arr1.length + arr2.length], arr3[1] → data[arr1.length + arr2.length + 1], ...
        System.arraycopy(arr3, 0, data, arr1.length + arr2.length, arr3.length);

        return data; // 합쳐진 배열 반환
        
    }// end process()

}// end class
