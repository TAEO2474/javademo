package ncs.test06_TaeO;

public class InvalidException extends Exception {
    public InvalidException(String message) {
        super(message);//Exception 조상클래스로 메세지 보냄. 
    }
}

//"입력 값에 오류가 있습니다" 메세지는 
//super(message)는 부모 클래스인 Exception의 생성자를 호출하는 거야.
//이 말은 → "입력 값에 오류가 있습니다" 라는 문자열 메시지를
//→ Exception 클래스 안에 있는 예외 메시지 저장소에 저장한다는 뜻이야.
//즉, 부모 클래스 Exception이 이 메시지를 갖고 있게 되는 거지!