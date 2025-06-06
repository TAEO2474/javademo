package java018_collection.part10;

public class Box <T> { //<아무문자> 설정가능 
	private  T data;
	
	public Box() {
		
	}
	
	public Box(T data) {
		this.data = data;
		
	}

	public void setData(T data) {
		this.data = data;
		
	}

	public T getData() {
		return data;  
		
	}
	
}// end class 

