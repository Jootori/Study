package ch07.sec02;

public class SmartPhone extends Phone {

	public boolean wifi;// 생성자 (재료) 선언

		
	public SmartPhone(String model, String color) { // 생성자 (재료) 선언
//		super(); 생성자 자동 추가됨
		this.model = model;// 부모 클래스의 객체 초기화 //model 출력
		this.color = color;// 부모 클래스의 객체 초기화 //color 출력
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
