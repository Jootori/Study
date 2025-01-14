package ch07.sec10;

public class AbstractMehodeExample {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Dog 클래스를 인스턴스화, 실체 생성
        dog.sound();

        Cat cat = new Cat(); //Cat 클래스를 인스턴스화, 실체 생성
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }
    public static void animalSound (Animal animal) {
        animal.sound();
    }
}
