package ncs.test01_TaeO;

// [출력]
//합계 : 767.00  
//평균 : 38.35  
public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56, 21 }, 
						  { 82, 10, 12, 61, 45 }, 
				          { 14, 16, 18, 78, 65 },
				          { 45, 26, 72, 23, 34 } };
		double sum = 0;
		int count = 0;
	
		
		for (int i = 0; i < array.length; i++) {
		 for (int j = 0; j < array[i].length; j++) {// array[i].length :I번째 행의 개수
			 sum += array[i][j];	
			 count++;
		 }
		 
		}
		double avg = sum/count;
		 
		System.out.printf("합계:%.2f\n", sum); 
		
		System.out.printf("평균:%.2f\n",  avg); 
		
	} // end main

}// end class
