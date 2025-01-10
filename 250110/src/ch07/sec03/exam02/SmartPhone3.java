package ch07.sec03.exam02;

public class SmartPhone3 extends Phone3 {
	
	public SmartPhone3 (String model, String color) {
		super(model, color);//phone3의 초기화 선언 = 뒤에서도 쓸거기 때문에 ~
		
		System.out.println("SmartPhone(Sting model, String color) 생성자 실행됨 ");
		
	}

}
