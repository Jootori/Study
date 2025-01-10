package ch07.sec06.package2;

import ch07.sec06.package1.A;

// 클래스 생성 
public class D extends A{
	
//	생성자 선언
	public D() {
	super(); //A() 생성자 호
	}
	
//	메소드 선언 
	public void method1() {
		this.field = "vlaue";
		this.method();
		
	}
	
	
}
