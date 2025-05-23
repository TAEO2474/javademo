package java002_statements;

//switch(식){
//case 값1 : 수행할 문장; break;
//case 값2 : 수행할 문장; break;
//case 값3 : 수행할 문장; break;
//default : 수행할 문장;
//}
//
//식의 결과 타입 : byte, short, char, int, enum(jdk7), String(jdk7) ->W
//switch~case에서 break을 만나면 현재 수행중인 제어문을 완전히 빠져나옴
//

public class Java021_switch {

	public static void main(String[] args) {
		int jumsu = 97;
		//90 이상 : A, 90미만~ 80이상 : B, 80미만~70이상 : C, 70미만~ 60이상 : D, 60미만 : F
		switch(jumsu/10) {
		case 10 : 
		case 9 : System.out.printf("점수가 %d 이므로 학점 %c입니다", jumsu, 'A');break;
		case 8 : System.out.printf("점수가 %d 이므로 학점 %c입니다", jumsu, 'B');break;
		case 7 : System.out.printf("점수가 %d 이므로 학점 %c입니다", jumsu, 'C');break;
		case 6 : System.out.printf("점수가 %d 이므로 학점 %c입니다", jumsu, 'D');break;
		default : System.out.printf("점수가 %d 이므로 학점 %c입니다", jumsu, 'F');break;

//코드에서 switch (jumsu / 10)이라고 했기 때문에, 예를 들어:	
//jumsu = 100 → 100 / 10 = 10
//jumsu = 95 → 95 / 10 = 9
//jumsu = 84 → 84 / 10 = 8 
//jumsu = 71 → 71 / 10 = 7
//jumsu = 62 → 62 / 10 = 6
//jumsu = 59 → 59 / 10 = 5
//이렇게 나오게 됩니다.

//그래서:

//case 10, 9 → 90~100점 → A 학점
//case 8 → 80~89점 → B 학점
//case 7 → 70~79점 → C 학점
//case 6 → 60~69점 → D 학점
//default → 59점 이하 → F 학점
		}

	}

}

// (jumsu >= 90) {
//    System.out.printf("점수가 %d 이므로 학점 %c입니다\n", jumsu, 'A');
//} else if (jumsu >= 80) {
//    System.out.printf("점수가 %d 이므로 학점 %c입니다\n", jumsu, 'B');
//} else if (jumsu >= 70) {
//    System.out.printf("점수가 %d 이므로 학점 %c입니다\n", jumsu, 'C');
//} else if (jumsu >= 60) {
//    System.out.printf("점수가 %d 이므로 학점 %c입니다\n", jumsu, 'D');
//} else {
//    System.out.printf("점수가 %d 이므로 학점 %c입니다\n", jumsu, 'F');

