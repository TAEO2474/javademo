package java013_api.part03;

import java.util.Arrays;

public class Java139_Math {

    public static void main(String[] args) {
        int[] num = new int[6]; // 로또 번호는 6개

        for (int i = 0; i < num.length; i++) {
            // 난수 생성 (1~45)
        	//  num[i] = (int) (Math.random() * 45) + 1;
        	//  num[i] = (int) Math.floor(Math.random() * 10) + 1;
        		num[i] = ((int) Math.floor(Math.random() * 100) + 1) % 45 + 1;


            // 중복 검사
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--; // 중복되면 현재 자리 다시 시도
                    break;
                } // end if
            }// end for j
        }//end fori

        // 출력
        for (int data : num) 
            System.out.printf("%4d", data);
        //오름차순
//        Arrays.sort(num);
//        for(int data: num)
//        	System.out.printf("%4d", data);
        
    } //end main 
}//end class