package ch07.확인문제;

public class Child2 extends Parent2{
    public String name;

    public Child2() {
        this ("홍길동");
        System.out.println("Child() call");

    }
    public Child2 (String name) {
        this.name = name;
        System.out.println("Child2 (String name) call");
    }
}
