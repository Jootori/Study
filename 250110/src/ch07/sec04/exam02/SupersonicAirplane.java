package ch07.sec04.exam02;

//자식 클래스 선언 
public class SupersonicAirplane extends AirPlane {

//	상수 선언 (불변 값 'final' 을 통해 정의)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

//	상태 필드 선언 
	public int flymode = NORMAL; //기본값 정의 

//	부모 메서드 오버라이딩
	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초고속 비행합니다.");
		} else {
			super.fly(); // "일반 비행합니다." 호출
		}

	}

}
