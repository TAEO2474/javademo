package java008_static_access.part08;
// 캡슐화(encapsulation) : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법으로
//                     데이터의 접근 제한을 원칙으로 한다.
//                    
//  캡슐화 정의 방법
//  1. 멤버변수의 접근제어자는 private으로 선언한다.
//  2. setter메서드의 정의 방법
//     - 접근제어자 public으로 지정한다.
//     - 리턴 타입은 void으로 지정한다.
//     - 메소드명은 set으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게 한다.
//      private int num;
//      public void setNum(int num){
//           this.num = num;
//      }
//     
//  3. getter메서드의 정의 방법
//    - 접근제어자 public으로 지정한다.
//    - 리턴타입은 멤버변수의 데이터 타입과 같게 한다.
//    - 메소드명은 get으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게 한다.
//      public int getNum() {
//        return num;


//getter → 값을 가져오는 메서드
//setter → 값을 설정(저장)하는 메서드



public class Time {
    // 1. 멤버변수 (클래스의 상태를 나타내는 변수들)
    private int hour;   // 멤버변수: 시간을 나타내는 변수
    private int minute; // 멤버변수: 분을 나타내는 변수
    private int second; // 멤버변수: 초를 나타내는 변수
    
    // 3. 생성자() {} 
    // 기본 생성자: 객체를 생성할 때 호출된다
    public Time() {
        // 생성자가 비어 있으므로 초기화가 없다.
    }

    // 4. 메소드 () {} (객체의 행동을 정의하는 메소드들)
    public int getHour() {
        return hour;  // hour 값을 반환하는 메소드
    }

    public void setHour(int hour) {
        this.hour = hour;  // hour 값을 설정하는 메소드
    }

    public int getMinute() {
        return minute;  // minute 값을 반환하는 메소드
    }

    public void setMinute(int minute) {
        this.minute = minute;  // minute 값을 설정하는 메소드
    }

    public int getSecond() {
        return second;  // second 값을 반환하는 메소드
    }

    public void setSecond(int second) {
        this.second = second;  // second 값을 설정하는 메소드
    }
}
	
	
	
	
	

	