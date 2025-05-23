package java007_class.part09;

public class Java083_for {

	public static void main(String[] args) {
		Employees[]  emp = new Employees[2];
		emp[0]  = new Employees("john",5000);
		emp[1]  = new Employees("Steven",9000);
		
		for (Employees data : emp)
			System.out.println(data.toString());
	}

}
//for (Employees data : emp)는 향상된 for문 (Enhanced for-loop) 또는 foreach문이라고 불리며, 
//배열이나 컬렉션을 순회(iterate)할 때 사용되는 간결한 반복문입니다.