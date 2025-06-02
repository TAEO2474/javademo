package java024_lombok.part02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//@Data (@ToString, @Getter, @Setter를 묶어 놓은것)

@AllArgsConstructor // 매개변수 모두를 포함한 생성자
@ToString //  객체를 문자열로 표현할 때 사용하는 메소드
@Getter // 캡슐화된 메소드
@Setter // 캡슐화된 메소드

@NoArgsConstructor // 기본생성자
public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;

}
