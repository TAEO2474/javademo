package java006_class.part08;

public class Java073_this {

	public static void main(String[] args) {
		Employees emp1 = new Employees( "김사부", "영업부", 5000);
		System.out.println(emp1.toString());
		
		Employees emp2 = new Employees("김민재");
		System.out.println(emp2.toString());

	} // END MAIN

}//END CLASS
