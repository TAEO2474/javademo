package java003_statements;
 // while 사용목적: 언제 끝날지 몰라도, 조건을 보고 반복할 때
public class Java037_while {

	public static void main(String[] args) {
		int cnt =1;
		while(true) {
			System.out.println(cnt++);
			if (cnt ==6) {
				break;
			}
		}
	}

}
