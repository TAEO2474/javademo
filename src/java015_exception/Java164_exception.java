 package java015_exception;
//오늘의 수업: 자바 파일 입출력과 Checked Exception 처리 (FileReader, IOException)
// 1. 파일 읽기 (File I/O)
//File 클래스: new File("sample.txt") 를 통해 sample.txt라는 파일 객체를 생성 (존재 여부는 이 단계에서 확인되지 않음)
//FileReader: 파일을 문자 단위로 읽을 수 있는 클래스
//fr.read()는 파일의 첫 번째 문자의 ASCII 코드(정수값) 를 읽어서 출력 (106은 문자 'j'에 해당)

// 2. Checked Exception
//FileNotFoundException: FileReader 생성 시 해당 파일이 존재하지 않으면 발생하는 컴파일 예외
//IOException: read() 호출 시 발생할 수 있는 입출력 예외
//※ 이 예외들은 컴파일 타임에 처리하도록 강제되기 때문에 try-catch 또는 throws가 반드시 필요함 → Checked Exception
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java164_exception {

	public static void main(String[] args) {
		// sample.txt라는 파일 객체 생성 (파일이 실제 존재하는지는 아직 확인하지 않음)
		File file = new File("sample.txt");
		System.out.println(file);  // 파일 경로 출력 (상대 또는 절대 경로)

		FileReader fr = null;

		try {
			// FileReader는 파일을 문자 단위로 읽는 클래스
			// 파일이 존재하지 않으면 FileNotFoundException 발생
			fr = new FileReader(file);

			// 파일에서 첫 번째 문자 1개를 읽어서 정수(ASCII 코드)로 반환
			// 예: 파일 내용이 "java"일 경우 'j' → 106
			System.out.println(fr.read());

		} catch (FileNotFoundException e) {
			// 파일이 존재하지 않을 경우 예외 발생
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();

		} catch (IOException e) {
			// 파일 읽기 중 문제가 발생했을 때 처리
			System.out.println("파일 읽기 중 오류 발생.");
			e.printStackTrace();
		}

		// ※ 주의: 파일을 열었으면 반드시 닫는 것이 좋지만
		// 여기선 생략되었음 (try-with-resources 또는 finally에서 닫는 것이 권장됨)
	}
}



