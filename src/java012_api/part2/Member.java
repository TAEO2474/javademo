package java012_api.part2;

public class Member /* extends Object*/{
	int id; //m1으로부터 받은 값 10 저장
			// m2으로부터 받은 값 10 저장
	   

	
	public Member() {
		
	}
	public Member(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {// 업캐스팅
		if (obj instanceof Member)
			return id ==((Member)obj).id;// 다운캐스팅
		else
			return false;
	}
	
}
