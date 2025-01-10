package ch07.sec02;

public class Phone {

	public String model;// 변수
	public String color;// 변수

	public void bell() { // 메서드
		// void를 사용하는 이유 : 출력값을 반환받지 않을 것이기 때문에

		System.out.println("전화벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("수신자 : " + message);

	}

	public void receiveVoice(String message) {
		System.out.println("발신자 : " + message);

	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");

	}

}
