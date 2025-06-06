package java009_inheritance.part05;
import java.lang.String;
import java.lang.System;
import java.lang.Override;

public class First /*extends Object*/ {
	int a=10;
	
	// 기본 생성자
	public First() {
	}
	
	// display 매소드
	protected void display() {
		System.out.println("a="+ a);
	}
	
	//오버라이드 + toString() 매소드
	@Override
	public String toString() {
		return String.format("a=%d",a);
	} 

}
