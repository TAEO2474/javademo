package ncs.test07_TaeO;

import ncs.test05_TaeO.Book;

public class StudentTest {
	public static void main(String args[]) {
		Student[] students = new Student[3];
		 students [0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		 students [1] = new Student("한사랑", 23, 183, 72, "201402", "건축");
		 students [2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		 
		System.out.println("name\tage\theight\tweight\tnumber\tmajor");
		for(Student s : students ) {
        System.out.println(s.toString());
      // =System.out.println(s); -> toString() 생략가능 
			
			
		}
	
	}
}
