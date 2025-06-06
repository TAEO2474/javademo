package java010_abstract_interface.part06;

public class UserTest extends User implements Score, Print {
	int s;

	public UserTest() {
	}

	public UserTest(String name, int s) {
		super(name);
		this.s = s;
	}

	@Override
	public String toPaint() {
		// TODO Auto-generated method stub
		return String.format("이름: %s\n점수: %d점\n", toString(),getScore());
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return s * sol;

	}
}// end class
