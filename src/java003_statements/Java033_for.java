package java003_statements;
// 이중 for문(반복문 안에 반복문) 구조는 컴퓨터가 표처럼 생긴 데이터를 다룰 때 정말 많이 사용돼요.
//1   2   3   4   5
//
//1   2   3   4   5
//
//1   2   3   4   5
//
//1   2   3   4   5

public class Java033_for {

	public static void main(String[] args) {
		for (int row =1; row <=4; row++) { // "이걸 4번 반복해!" 라는 뜻이야. 즉, 4줄을 만들 거야. (1줄, 2줄, 3줄, 4줄)
			int data=1;//data라는 숫자 상자를 만들고, 처음엔 1을 넣어. 이 줄은 매 줄마다 새로 시작할 때마다 다시 1부터 시작하게 돼.
			for (int col =1; col <=5; col++) {// 한 줄에 숫자를 5개 출력할 거야.죽 줄 하나 안에서 이걸 5번 반복하는 거야.
				System.out.printf("%4d",data++); //data 값을 예쁘게 네 칸 공간으로 출력해. data++는 숫자를 출력하면서 1을 더해주는 거야. 처음엔 1을 출력하고, 그 다음엔 2, 그 다음엔 3...
			}
			System.out.println("\n");//줄을 바꿔줘! 다음 줄로 내려가서 다시 새 줄 시작!
		}
	}

}
