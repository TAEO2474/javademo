package java003_statements;
//	do { } while (조건);
// 조건이 false여도 1번은 반드시 실행됨
// 최소 1번은 반드시 실행해야 할 때

public class Java038_dowhile {

	public static void main(String[] args) {
		char chk ='n';
		
		do {
			System.out.println("고객님 주문하시겠습니까?(y/n)");
			
		}while(chk=='y');//chk가 'y'일 때만 반복하겠다는 뜻이에요. 근데 지금 chk = 'n'이니까 조건이 거짓 ❌.그래서 단 한 번만 실행하고 끝나요.

	} //end main

}//end class
