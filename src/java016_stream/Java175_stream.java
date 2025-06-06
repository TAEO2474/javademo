package java016_stream;
//중요: 이것만이라도 보세요 !!!
// Create folder 출력 후, 다음으로 javademo 마우스 오른쪽 [Refresh 단축키 f5] 클릭
import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		//File file = new File("temp");
		// File 객체 생성: 상대경로 "parent/child" 폴더를 참조
		File file = new File("parent/child");
		
		// 현재 지정한 경로가 디렉토리인지 확인
		System.out.println(file.isDirectory());
		
		// 디렉토리(폴더/파일)가 존재하지 않으면 생성
		if(!file.isDirectory()) {			
			//file.mkdir(); //생성할 폴더가 1개 일때
			  file.mkdirs(); //생성할 폴더가 1개 이상일때("parent/child" 폴더 2개임으로 mkdirs() 사용)
			System.out.println("Create folder"); // 폴더 생성되었음을 알림
		}
		
		
		
	}//end main()

}//end class
