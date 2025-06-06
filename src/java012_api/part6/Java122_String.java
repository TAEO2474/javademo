package java012_api.part6;

public class Java122_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		
//		System.out.println("ip: " + sn.substring(0, 9));
//		System.out.println("port: " + sn.substring(10, 14));
		
		int index =sn.indexOf(":"); //:콜론까지를 인덱스로 하겠다. 즉 인덱스는 9
		System.out.println("ip: " + sn.substring(0, index));//ip: 127.0.0.1
		System.out.println("port: " + sn.substring(index + 1));//(9+1=10번째 인덱스부터) port: 8080
		
		System.out.println("==================================================");
		String[] data = sn.split(":");// 127.0.0.1[0 index]    :    8080 [1 index]
		System.out.println("ip:"+data[0]);
		System.out.println("ip:"+data[1]);
	}

}
 