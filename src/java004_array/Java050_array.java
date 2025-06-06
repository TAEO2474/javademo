package java004_array;

//[출력결과]
//1  2  3  4  5
//10 9  8  7  6
//11 12 13 14 15
//20 19 18 17 16
// 핵심내용
//num.length → 전체 행의 수
//num[i].length → i번째 행의 열의 수

public class Java050_array {

    public static void main(String[] args) {
        // 2차원 배열 초기화: 4개의 행과 5개의 열로 구성된 배열
        int[][] num = { 
            { 1, 2, 3, 4, 5 },     // 첫 번째 행: 1, 2, 3, 4, 5
            { 6, 7, 8, 9, 10 },    // 두 번째 행: 6, 7, 8, 9, 10
            { 11, 12, 13, 14, 15 },// 세 번째 행: 11, 12, 13, 14, 15
            { 16, 17, 18, 19, 20 } // 네 번째 행: 16, 17, 18, 19, 20
        };

        // 행(row) 순차적으로 반복
        for (int row = 0; row < num.length; row++) {  // num.length는 4, 즉 4개의 행을 의미
            // 열(column) 순차적으로 반복
            for (int col = 0; col < num[row].length; col++) { // num[row].length는 각 행의 열 개수 (5)
                // 짝수번째 행 (0번째, 2번째 행)에서는 숫자를 그대로 출력
                if (row % 2 == 0) {  // 짝수 번째 행일 때 (0, 2번째 행)
                    System.out.printf("%4d", num[row][col]);  // 해당 행의 숫자 그대로 출력
                } else {  // 홀수 번째 행 (1번째, 3번째 행)
                    // 홀수 번째 행에서는 숫자 순서를 반대로 출력
                    // num[row].length - 1 - col은 해당 행의 마지막 열부터 역순으로 접근
                    System.out.printf("%4d", num[row][num[row].length - 1 - col]);  
                }
            }
            // 한 행의 출력이 끝날 때마다 줄바꿈
            System.out.println();  // 각 행 끝에 줄바꿈을 추가하여 보기 좋게 출력
        }
    }
}

