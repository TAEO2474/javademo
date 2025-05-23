package java003_statements;
//go: 라벨(label)과 break go;는 뭐냐면?
//자바에서는 보통 break;를 쓰면 가장 가까운 반복문 하나만 멈춰요.
//그런데 반복문이 겹쳐져 있을 때(중첩),
//바깥쪽 반복문까지 한 번에 멈추고 싶을 때는 라벨(label)을 써요.
public class Java035_for {

	public static void main(String[] args) {
		go: //label
		for (int i = 1; i <= 3; i++) { 
			for (int j = 1; j <= 5; j++) {
					System.out.printf("j=%d\n", j);
					if(j ==3) {
						// break; //  if(j ==3)면 그냥 여기서 멈춰라
						// break go;// "go"라고 이름 붙인 바깥 라벨 for문 (for (int i = 1; i <= 3; i++))까지 멈춰라
						//continue; //for문에서 continue;를 만나면 현재 수행중인 for문의 "증감식"으로 이동한다. 
						            //만약 j가 3이면...그 줄은 건너뛰고, 다음 숫자로 넘어가!
						continue go;//for문에서 continue go;를 만나면 go라벨이 설정된 수행중인 for문의 "증감식"으로 이동한다
					}
			}
		}
 

	}

}
