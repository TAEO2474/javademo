package java012_api.part6;

import java.util.Arrays;

public class Java120_Object_clone {

	public static void main(String[] args) {
		Rect[] rect = new Rect[3];
		rect[0] = new Rect(2, 5);
		rect[1] = new Rect(1, 4);
		rect[2] = new Rect(3, 2);

		// Rect[] copy = rect;
		
		Rect[] copy = rect.clone();
		System.out.println(rect);//[Ljava012_api.part6.Rect;@7a81197d
		System.out.println(copy);//[Ljava012_api.part6.Rect;@5ca881b5
		System.out.printf("%d %d \n", rect[0].width, rect[0].height);
		System.out.printf("%d %d \n", copy[0].width, copy[0].height);
		
//		copy[0].width =100;
//		copy[0].height =200;
//		System.out.printf("%d %d \n", rect[0].width, rect[0].height);
//		System.out.printf("%d %d \n", copy[0].width, copy[0].height);
		
		for(int i=0; i<copy.length; i++)
			copy[i] = copy[i].clone();
		copy[0].width =100;
		copy[0].height =200;
		System.out.printf("%d %d \n", rect[0].width, rect[0].height);
		System.out.printf("%d %d \n", copy[0].width, copy[0].height);
	 }
}
