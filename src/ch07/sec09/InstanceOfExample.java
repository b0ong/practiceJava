package ch07.sec09;

public class InstanceOfExample {
    //    main() 메소드에서 바로 호출하기 위해 정적메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

//        person이 참조하는 객체가 Student 타입일 경우
//        student 변수에 대입(타입 변환 발생)
        if (person instanceof Student student) {
            System.out.println("stdentNo : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
//        Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("한국진");
        personInfo(p1);

        System.out.println();

//        Student 객체를 매개값으로 재공하고 personInfo() 메소드 호출
        Person p2 = new Student("김영비", 10);
        personInfo(p2);

    }
}
