package ch07.sec03.exam02;

public class Phone3 {

//	필드생성
//	객체 'model, color'선언
//	객체의 기본값 'null'
	public String model;// 변수, 'null'
	public String color;// 변수, 'null'
	
//	매개변수를 가진 Phone3(부모 class) 생성자 선언(초기화)
	public Phone3(String model, String color) { //기본 생성자로 Phone3의 model, color 초기화 
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
		
		
	}

}
