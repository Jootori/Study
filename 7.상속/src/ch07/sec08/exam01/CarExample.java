package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HK_Tire();
        myCar.run();

        myCar.tire = new KH_Tire();
        myCar.run();
    }
}
