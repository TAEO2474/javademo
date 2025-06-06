package ncs.test06_TaeO;

public class Calculator {

    public static double getSum(int num) throws InvalidException {
    // 메소드 내부에서 InvalidException 예외가 발생할 수 있음을 메인메소드에게 미리 알리기 위해서이고, 
    // if 문이 먼저 오고,  무조건 return sum;이 마지막에 와야한다.
        if (num < 2 || num > 5) {
            throw new InvalidException("입력 값에 오류가 있습니다"); //->InvalidException클래스로 해당 메세진 던지
        }

        double sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
