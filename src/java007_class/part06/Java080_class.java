package java007_class.part06;

public class Java080_class {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		cal.addValue(2,  7, 5);
       // float으로 정의된 메소드가 없으면
	   // 상위 데이터 타입을 찾아서 자동 형변환시킨다.
		 cal.addValue(1.0F, 2.0F);
							
	     cal.addValue(1L, 2L);
				
			} //end main()
		}//end class

