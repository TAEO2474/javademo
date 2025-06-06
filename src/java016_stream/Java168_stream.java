package java016_stream;


import java.io.IOException;
import java.io.InputStream;

/*
 * carriage return : 줄의 처음으로 이동(13)
 * line feed : 다음 줄로 이동(10)
 */
//✅ 왜 이런 출력 결과가 나오는가? a입력 시, 97 13 10
//System.in.read()는 바이트 단위로 읽습니다.
//콘솔에서 엔터를 치면 \r(13), \n(10) 두 바이트가 입력됩니다.
//따라서 a만 입력해도 3개의 입력이 버퍼에 쌓이게 됩니다.
public class Java168_stream {

	public static void main(String[] args) {
		System.out.print("데이터 입력:");
		
		InputStream is = System.in;
		int data;
		
		try {
			data = is.read();
			System.out.println(data);  //97
			data = is.read();
			System.out.println(data);  //13
			data = is.read();
			System.out.println(data);  //10
			
			while((data = is.read()) != 13) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}//end main()

}//end class
