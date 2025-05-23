package java004_array;

//[출력결과]
//1 2  3  4   5
//-  -  -  -   -
//11 12 13 14 15
//-  -   -  -  -

// 홀수열은 숫자 나오게, 짝수행은  -  -  -  -   - 

public class Java049_array {

    public static void main(String[] args) {
        // 2차원 배열 초기화: 4개의 행과 5개의 열로 구성된 배열
        int[][] num = {
            { 1, 2, 3, 4, 5 },   // 첫 번째 행
            { 6, 7, 8, 9, 10 },  // 두 번째 행
            { 11, 12, 13, 14, 15 }, // 세 번째 행
            { 16, 17, 18, 19, 20 }  // 네 번째 행
        };

        // 행(row) 순차적으로 반복
        for(int row = 0; row < num.length; row++) { // num.length는 4, 즉 4개의 행을 의미
            // 열(column) 순차적으로 반복
            for(int col = 0; col < num[row].length; col++) { 
                // num[row].length는 각 행에 있는 열의 개수 (5)
                
                // 행이 홀수일 때 (1, 3번째 행)
                if (row % 2 == 1) {  
                    System.out.printf("%4c", '-');  // '-' 문자 출력
                } else { 
                    // 행이 짝수일 때 (0, 2번째 행)
                    System.out.printf("%4d", num[row][col]);  // 숫자 출력
                }
            }
            // 한 행의 출력이 끝날 때마다 줄바꿈
            System.out.println();  // 각 행 끝에 줄바꿈을 추가하여 보기 좋게 출력
        } //end for문 (열 반복문)
    } //end main
} //end class

