package java012_api.part6;
//1 매개변수로 받은 메시지 문자열에서 적절한 제품정보를 추출하여
//  콘솔에 출력하는 handleMessage() 메서드를 구현하시오.
//  단, 메시지 형식은 "제품아이디:제품명:가격:수량:제조사"
//    순서로 구성되어야 한다.
// 만약 메시지를 구성하는 요소가 적을 경우
//   실행 결과와 동일한 메시지를 사용자에게 보여줘야 한다.
// 
//2 출력결과
//<< 첫 번째 메시지 >>
//제품 아이디 : PROD-00001
//제품명 : iPhone4
//가격 : 940000
//수량 : 4
//제조사 : 애플
//<< 두 번째 메시지 >>
//메시지 형식이 잘못되었습니다.
//메시지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다.
public class Java124_String {
	public static void main(String[] args) {
		System.out.println("<< 첫 번째 메시지 >>");
		handleMessage("PROD-00001:iPhone4:940000:4:애플");
		System.out.println("<< 두 번째 메시지 >>");
		handleMessage("PROD-00002:갤럭시S:960000:삼성");
	} // end main()
	
	private static void handleMessage(String sn) {
		// 제품아이디, 제품명, 가격, 수량, 제조사를 출력하는 프로그램을 구현하시오.
		String[] title = new String [] {"제품명 아이디","제품명","가격","수량","제조사"};
		String[] data = sn.split(":");// [0]PROD-00001: [1]iPhone4 [2]940000:[3]4: [4]애플
		if(data.length==5) {         //[0]PROD-00002:[1]갤럭시S:[2]960000:[3]삼성 즉,4=5 틀림 -else 이동
			for (int i = 0; i<data.length; i++) {
				System.out.printf("%s: %s\n", title[i], data[i]);
			}
		} else {
			System.out.println("메시지 형식이 잘못되었습니다.");
			System.out.println("메시지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다.");
		}
		
		
//		System.out.println("제품 아이디: "+data[0]);
//		System.out.println("제품명: "+data[1]);
//		System.out.println("가격: "+data[2]);
//		System.out.println("수량: "+data[3]);
//	    System.out.println("제조사: "+data[4]);
		
		
	} //end handleMessage()
} // end class
