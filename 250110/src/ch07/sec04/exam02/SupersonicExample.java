package ch07.sec04.exam02;

public class SupersonicExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		System.out.println("- - - - - -");
		
		sa.fly();
		System.out.println("- - - - - -");
		
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		System.out.println("- - - - - -");
		
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();
		System.out.println("- - - - - -");
		
		sa.takeOff();

	}

}
