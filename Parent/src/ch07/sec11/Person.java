package ch07.sec11;

public sealed class Person permits Employee, Manager {
    public String name;

    public void work() {
        System.out.println("업무가 지정되지 않은 상태입니다.");
    }
}
