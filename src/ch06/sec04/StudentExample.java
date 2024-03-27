package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Studednt 겍체를 참조합니다.");

        Student s2 = new Student(); //s1 이랑 s2는 서로 다른 객체(주소값)를 참조한다.
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
