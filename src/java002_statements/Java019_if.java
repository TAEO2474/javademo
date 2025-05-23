package java002_statements;

//다중 if~else
//
//if(조건식){
//수행할 문장;
//}else if(조건식){
//수행할 문장;
//}else if(조건식){
// 수행할 문장;
//}else{
// 수행할 문장;
//}
//

public class Java019_if {

	public static void main(String[] args) {
		char code ='B'; // "A", "B", "C","알파벳 혹은 숫자 1개" 변경해서 테스트해보기
		
		if (code == 'A') {
			System.out.println("식품류");
		} else if (code == 'B') {
			System.out.println("육류");
		} else if (code == 'C') {
			System.out.println("공산품");
		} else {
			System.out.println("기타");
		}
	}//end main
}//end class
