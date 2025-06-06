package java013_api.part05;
import java.util.Scanner;
//단입력: 5
//5 X 1 = 5
//5 X 2 = 10
//. . .
//5 X 9 = 45
//계속하시겠습니까?(종료:n, 계속:아무키) n
//프로그램종료
public class Java148_Scanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	while(true) {
		System.out.print("단입력: ");
		int dan = sc.nextInt();
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d X %d = %2d\n", dan, i, dan*i );
		}
		
		System.out.print("계속하시겠습니까?(종료:n, 계속:아무키) ");
		String chk = sc.next(); //**사용자에게 입력을 받아 문자열(String)**로 저장하는 코드
		if(chk.equals("n") || chk.equals("N")) {
			System.out.println("프로그램종료");
			break;
		}
	}
	
}//end main()
}//end class

