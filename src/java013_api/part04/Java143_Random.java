package java013_api.part04;
import java.util.Random;

public class Java143_Random {
		public static void main(String[] args) {
			// new Random(seed);
			// seed: 고정된 난수값을 구할 때 사용한다.
			Random ran = new Random();
			System.out.println(ran);
			
			double r1 = ran.nextDouble();
			System.out.println(r1);
			
			int r2 = ran.nextInt();
			System.out.println(r2);
			
			// between 0 (inclusive) and the specified value (exclusive)
			//0부터 ~ 10미만의 정수 랜덤(난수)
			int r3 = ran.nextInt(10);
			System.out.println(r3);
			
			
		}// end main()
	}// end class


