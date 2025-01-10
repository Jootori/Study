package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {

//		SmartPhone 객체 생성 (인스턴스화)
		SmartPhone myPhone = new SmartPhone("iphone", "silver");

//		Phone에서 상속받은 필드 읽기 
		System.out.println("Model : " + myPhone.model);
		System.out.println("Color : " + myPhone.color);

//		SmartPhone의 필드 읽기
		System.out.println("wifi state : " + myPhone.wifi);

//		Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("Hello~?");
		myPhone.receiveVoice("Hi. I'm JUSTIN. Is there AMY ?");
		myPhone.sendVoice("Oh, she went to the hospital now. She'll be back at 7 o'clock");
		myPhone.receiveVoice("Ok. I'll call be back soon.");
		myPhone.hangUp();

//		SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();

	}

}
