package java009_inheritance.part03;

public class SuperConst /* extends object */ {
	int x; //=this.x ->10
	int y; //=this.y -> 20

	// 생성자 
	public SuperConst(int x, int y) {//10, 20 //4
		super(); //5
		this.x = x; //this.x = 10 //6
		this.y = y; // this.y = 20 //7
		
	} //end SuperConst //8

}//end  SuperConst
