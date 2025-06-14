package ncs.test08_TaeO;

import java.util.List;

import ncs.test07_TaeO.Student;

public class UserTest {
	public static void main(String args[]) {
		User[] users = new User[3];
		users [0] = new User("user01", "pass01", "김철수", 32, "M", "010-1234-5678");
		users [1] = new User("user02", "pass02", "이영희", 25, "F", "010-5555-7777");
		users [2] = new User("user03", "pass03", "황진이", 20, "F", "010-9874-5632");
		
		System.out.println("User List --------------------------------------");
		
		for(User u : users) {
	        System.out.println(u.toString());
		
		// User 객체를 3개 생성하여 배열에 넣는다.
		// 배열에 있는 객체 정보를 모두 toString() 으로 출력 한다. – for 문을 이용 할 것
		User[] copyUsers = new User[users.length];
		//users 가 참조하는 객체들의 복사본을 만든다. - for 문을 이용 할 것
		//copyUsers 의 객체 정보를 모두 출력한다 – for each 문을 이용할 것
		//users 와 copyUsers 의 각 index 별 객체의 값들이 일치하는지 확인 출력한다.
}
}
