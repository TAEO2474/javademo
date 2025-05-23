package java002_statements;

//조건식을 만족할때만 수행할 문장이 있는 경우
//if(조건식) {
// 수행할 문장;
//}

public class Java017_if {

	public static void main(String[] args) {
		//int num = - 8; //program end
		int num = 8;// 8는 자연수입니다. program end
		if (num > 0) {
			System.out.printf("%d는 자연수입니다. \n", num);
		}
		System.out.println("program end");
	}

}
//자연수는 **1, 2, 3, 4, 5, ...**처럼 1부터 시작해서 계속 더해지는 양의 정수들을 말합니다.

///자연수의 특징:
//0은 포함하지 않습니다 (단, 일부 수학 분야에서는 포함시키기도 하지만, 일반적으로는 포함하지 않음).
//
//음수는 포함되지 않습니다.
//
//분수나 소수도 포함되지 않습니다.
//
//예:
//자연수 ✔️ : 1, 2, 3, 100, 9999
//자연수 ❌ : 0, -1, 3.14, ½
//
//초등학교나 중학교 수학에서는 보통 자연수를 1 이상인 정수라고 생각하시면 됩니다.
