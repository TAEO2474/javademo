package java004_array;

//  1  2  3  4  5
//  6  7  8  9  10
//  11 12 13 14 15
//  16 17 18 19 20
//  
//  num배열에서 아래와 같이 출력이 되도록 구현
//  [출력결과]
//  1  2  *  4  5
//  *  7  8  *  10
//  11 * 13 14  *
//  16 17 * 19 20

//핵심내용
//num.length → 전체 행의 수
//num[i].length → i번째 행의 열의 수

public class Java048_array {

    public static void main(String[] args) {
        // 2차원 배열 초기화: 4행 5열 배열
        int[][] num = { 
            { 1, 2, 3, 4, 5 }, 
            { 6, 7, 8, 9, 10 }, 
            { 11, 12, 13, 14, 15 }, 
            { 16, 17, 18, 19, 20 } 
        }; // 변수 선언

        // 행(row) 순회
        for (int row = 0; row < num.length; row++) { // num.length는 행의 개수
            // 열(col) 순회
            for (int col = 0; col < num[row].length; col++) { // num[row].length는 각 행의 열 개수
                if (num[row][col] % 3 == 0) { // 3의 배수인지 확인
                    // 3의 배수일 경우 '*' 출력
                    System.out.printf("%4c", '*');
                } else {
                    // 3의 배수가 아닐 경우 해당 숫자 출력
                    System.out.printf("%4d", num[row][col]);
                }
            }
            // 각 행 끝에 개행문자 추가
            System.out.println();
        }

    } //end main

} // end class

