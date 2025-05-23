package java007_class.part03;

public class Calc {
	int left;
	int right;
	char ope;
	
	// 기본 생성자
	public Calc() {
		
	}

	public Calc(int left, int right, char ope) {
		super();// 부모 클래스의 생성자 호출
		this.left = left;//멤버변수 'left'에 매개변수 'left'를 대입
		this.right = right;// 멤버변수 'right'에 매개변수 'right'를 대입
		this.ope = ope;// 멤버변수 'ope'에 매개변수 'ope'를 대입
	}
	
	int Process() {
		switch (ope) {
		case '+':
			return left + right;
		case '-':
			return left - right;
		case '*':
			return left * right;
		default:
			return left / right;
			
		}
		
	}//end Process()
	public String toString() {
		return String.format("%2d %2c %2d = %2d", left ,ope, right, Process());
	}
}// end class
