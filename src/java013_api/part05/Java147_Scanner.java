package java013_api.part05;

import java.util.Scanner;

public class Java147_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("부서 연봉 평가:"); 
		 
		 String line = sc.nextLine();
		 System.out.println(line);
		 
		 String[] arr = line.split("\\s{1,}");
		 for (String data: arr)
			 System.out.println(data);
	}

}
