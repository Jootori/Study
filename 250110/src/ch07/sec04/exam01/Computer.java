package ch07.sec04.exam01;

public class Computer extends Calculator{//자식 클래스 선언 
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행 ");
		return Math.PI * r * r;
		
	}

}
