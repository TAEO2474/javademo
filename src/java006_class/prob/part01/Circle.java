package java006_class.prob.part01;

public class Circle {
	 String  food;
	 int  radius;
	 double  pi =3.14;
	 
	 
	 double area() {
			return radius*radius*pi;
		}
	 
		void display() {
			System.out.printf("%s의 면적은 %.2f입니다\n" , food, area());
		}	

}
