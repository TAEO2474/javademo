package java016_stream;
// 중요: 이것만이라도 보세요 !!!
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java176_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		//delete() : delete()메소드를 호출하면 바로 sample.txt을 삭제한다.
		//boolean chk = file.delete();
		//System.out.println(chk);
		
		//deleteOnExit() : 시스템이 종료되기 직전에 sample.txt을 삭제한다.
        file.deleteOnExit();
        
        Scanner sc =null;
        try {
			 sc = new Scanner(file);
			 while(sc.hasNextLine()) {
				 System.out.println(sc.nextLine());
			 }
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} finally {
			sc.close();
		}
        
	}//end main()

}//end class
