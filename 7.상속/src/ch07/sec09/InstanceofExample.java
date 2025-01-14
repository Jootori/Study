package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("studentNo" + student.studentNo);
            student.study();
        }
            //이미 Person이 Student에 속해 있어서 강제 타입이 필요가 있나..? >> 없다고 함 !
        }
        public static void main (String[] args) {
            Person p1 = new Person("홍길동");
                    personInfo(p1);
            System.out.println();


            Person p2 = new Student("김길동",10);
                    personInfo(p2);
                        }
        }