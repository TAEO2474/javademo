package java008_static_access.part06;

import java008_static_access.part05.Java088_access; 
//ava088_access p = new Java088_access(); 입력 후  "Ctrl + shift + o(알파벳)" 누르면
//import java008_static_access.part05.Java088_access; 나타남



public class Java090_access extends Java088_access {

	public static void main(String[] args) {
		// package가 다른 클라스는 접근할 때는 public일 경우에만 가능.
		// 그러나 상속관계일 경우, protected에도 접근이 가능.
		Java088_access p = new Java088_access();
//		System.out.printf("var_private=%d\n", p.var_private);
//		System.out.printf("var_private=%d\n", p.var_default);	
//		System.out.printf("var_private=%d\n", p.var_protected);
		System.out.printf("var_private=%d\n", p.var_public); // -> package가 다른 클라스는 접근할 때는 public일 경우에만 가능.

		System.out.println("=========상속후===========");
		Java090_access ps = new Java090_access();
//		System.out.printf("var_private=%d\n", ps.var_private);
//		System.out.printf("var_private=%d\n", ps.var_default);	
		System.out.printf("var_private=%d\n", ps.var_protected); //->상속관계일 경우, protected에도 접근이 가능.
		System.out.printf("var_private=%d\n", ps.var_public);
			
	}

}
