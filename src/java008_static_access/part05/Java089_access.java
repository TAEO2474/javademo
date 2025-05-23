package java008_static_access.part05;

public class Java089_access {

	public static void main(String[] args) {
		Java088_access p = new Java088_access();
//		System.out.printf("var_private=%d\n", p.var_private); -> 사용불가 
		System.out.printf("var_private=%d\n", p.var_default);	
		System.out.printf("var_private=%d\n", p.var_protected);//->상속관계일 경우, protected에도 접근이 가능.
		System.out.printf("var_private=%d\n", p.var_public);// -> package가 다른 클라스는 접근할 때는 public일 경우에만 가능.

	}

}
