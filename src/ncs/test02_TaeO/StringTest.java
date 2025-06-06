package ncs.test02_TaeO;
//합계:29.320
//평균:5.864
public class StringTest {

    public static void main(String args[]) {
        //멤버변수 (인스턴스 변수)
    	String str = "1.22,4.12,5.93,8.71,9.34";
        double data[] = new double[5];
        double sum = 0;

        // str에서 데이터를 분리한다.
        String[] st = str.split(",");
        //[0] = 1.22 , [1] =4.12, [2]5.93, [3]8.71, [4]9.34 -> 이렇게 st배열 생

        int i = 0; //개선된 for문의 경우, 지역변수로 인덱스 시작점 잡기("0부터 인덱스 시작할") 
        for (String s : st) { // st배열의 [0~4] 인덱스의 요소들을 문자로 담고 그것을 's'로 할께.
            data[i] = Double.parseDouble(s); // 근데, 문자열을 double실수로 변환하여 배열에 저장할꺼
            sum += data[i];// S배열 안에 들어간 실수로 변환된 요소들 하나씩 증가하면 계속 더 할께 ~
            i++;// 방금 위에서말한대로 계속 일씩 증하면서 
        } //s 배열[0~4인덱스 요소들 다 돌렸으면 할일 없으니 sum(29.320) 챙겨서 빠져 나와! (false for문 탈출!)

        double avg = sum / data.length; // 이제 챙겨온 합계(29.320) 가지고 계산식 대입해서 풀어~
                                        // 29.320/5= 5.864 = avg

        // 결과 값을 소수점 3자리까지 출력
        System.out.printf("합계:%.3f\n", sum); 
        System.out.printf("평균:%.3f\n", avg);
    }
}
