package ch07.sec10;

public abstract class Phone {
    //필드 선언
    String owner;

    //생성자 선언
    Phone(String owner){
        this.owner = owner;
    }

    //메서드 선언
void turnOn() {
    System.out.println("전원을 켭니다.");
}

void turnOff() {
    System.out.println("전원을 끕니다.");
}
}
