package java015_exception;
//오늘의 수업: 사용자 정의 예외 (User-Defined Exceptions)**와 **강제 예외 발생 (throw 사용법)
public class Java166_exception {

	public static void main(String[] args) {
	 int data =9;
			
	 
	 try{
		 if (data<10) {
			// throw: 개발작가 강제적으로 예외를 발생시킬때 사용한다
		 throw new UserException("10번이상만 가능합니다");
		 }
	 
	 	System.out.println(data);
	} catch(UserException ex) {
		System.out.println(ex.getMessage());
	}

 }
} 