  package java015_exception;
// 오늘의 수업: 자바 예외 처리: try-catch의 흐름과 예외 계층 구조

public class Java162_exception {
	public static void main(String[] args) {
		// 문자열 형태의 숫자 데이터를 정의
		String data1 = "8";
		String data2 = "0"; // 0으로 나누기 때문에 ArithmeticException이 발생할 예정

		try {
			// 문자열을 정수로 변환
			int x = Integer.parseInt(data1); // "8" → 8
			int y = Integer.parseInt(data2); // "0" → 0

			// 0으로 나누기를 시도 → 예외 발생 (ArithmeticException)
			int res = x / y;

			// 결과 출력 (이 줄은 예외 발생 시 실행되지 않음)
			System.out.println(res);

		// 숫자 형식이 잘못된 경우 (예: "abc") 예외 처리
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException 발생: " + ex.toString());

		// 산술 오류 예외 처리 (예: 0으로 나누기 등)
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException 발생: " + ex.toString());

		// 위에서 정의한 예외 외의 런타임 예외 처리
		} catch (RuntimeException ex) {
			System.out.println("RuntimeException 발생: " + ex.toString());

		// 모든 예외의 최상위 클래스 Exception 처리
		} catch (Exception ex) {
			System.out.println("Exception 발생: " + ex.toString());
		}
	} // end main()
} // end class



