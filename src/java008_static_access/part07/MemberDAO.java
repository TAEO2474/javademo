package java008_static_access.part07;

//<class 클래스 구성요소>
//1. 멤버변수
//2. static {}
//3. 생성자() {}
//4. 메소드 () {}

public class MemberDAO {

	// 1. 멤버변수
    private static MemberDAO dao = new MemberDAO(); 

    // 3. 생성자() {}
    private MemberDAO() {
    }
    
    // 4. getInstance 메소드 () {}
    public static MemberDAO getInstance() {
        return dao;
    }
 
    // 4. display 메소드 () {}
    public void display() {
        System.out.println("display");
    }
}