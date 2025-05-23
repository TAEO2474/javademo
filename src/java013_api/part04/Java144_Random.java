package java013_api.part04;

import java.util.Arrays;
import java.util.Random;

public class Java144_Random {

	public static void main(String[] args) {
        int[] num = new int[5]; // 로또 번호는 6개
        
        Random ran= new Random();
        for (int i = 0; i < num.length; i++) {
        	//num[i] =ran.nextInt(10) +1;
        	num[i] =ran.nextInt(45) +1;
            // 난수 생성 (1~45)
        	//  num[i] = (int) (Math.random() * 45) + 1;
        	//  num[i] = (int) Math.floor(Math.random() * 10) + 1;
        	//  num[i] = ((int) Math.floor(Math.random() * 100) + 1) % 45 + 1;


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
        
        	System.out.println();
        
        //오름차순
         Arrays.sort(num);
         for(int data: num)
        	System.out.printf("%4d", data);
        
    } //end main 
}//end class