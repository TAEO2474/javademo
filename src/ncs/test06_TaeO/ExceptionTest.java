package ncs.test06_TaeO;
//5입력시
//결과값: 15.0

import java.util.Scanner;

//6입력 시
//입력값에 오류가 있습니다
//import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        // 사용자에게 입받
    	Scanner sc = new Scanner(System.in);
        System.out.print("2부터 5까지 숫자 중 하나를 입력하세요: ");
        int num = sc.nextInt();
        sc.close();

        //예외처리 : 사용자가 조건의 범주 벗어나 숫자를 입력시 예외발생 메세지 띄우기 
        try {
            double sum = Calculator.getSum(num); // 사용자가 정한 num을 가지고 Calculator의 getSum메소드로 이동해서 계산하
            System.out.println("결과값: " + sum);
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
