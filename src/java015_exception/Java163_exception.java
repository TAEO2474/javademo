package java015_exception;
//오늘의 수업: 예외 처리와 안전한 사용자 입력 - InputMismatchException 다루기
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java163_exception {
	//첫번쩨메인메소드 -> 사용자로부터 2개의 정수를 입력받아 배열에 저장하고, 총합을 계산해서 출력합니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] data = new int[2]; // 정수 2개를 저장할 배열

		// 사용자로부터 두 개의 정수를 입력받아 배열에 저장하고 총합을 계산
		for (int i = 0; i < data.length; i++) {
			data[i] = inputData(sc, i);  // i번째 정수를 입력받아 배열에 저장
			sum += data[i];              // 총합에 더함 (수정된 부분)
		}

		// 최종 합계 출력
		System.out.println("배열 요소의 총합: " + sum);

		// 자원 정리
		sc.close();
	}

	// 사용자로부터 정수를 안전하게 입력받는 메서드
	//Scanner로 입력받을 때 사용자가 실수로 문자, 특수문자 등을 넣으면 예외가 발생합니다.
	// 그걸 직접 main()에서 처리하면 코드가 복잡해지기 때문에, 예외 처리를 별도 메서드로 분리한 겁니다.
	public static int inputData(Scanner sc, int index) {
		int num;

		while (true) {
			try {
				System.out.printf("%d번째 정수를 입력: ", index);
				num = sc.nextInt();  // 사용자로부터 정수 입력 받음
				break;               // 예외 없이 입력되면 루프 종료
			} catch (InputMismatchException ex) {
				// 정수가 아닌 입력이 들어왔을 때 처리
				System.out.println("정수를 입력하세요.");
				sc.next(); // 잘못된 입력값 제거
			}
		}
		return num; // 정상 입력된 정수 반환
	}
}



