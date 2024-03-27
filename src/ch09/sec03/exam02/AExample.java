package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        A.B b = new A.B(); // 객체생성
        System.out.println(b.field1);   // 인스턴스 필드
        b.method1();        // 메소드

        System.out.println(A.B.field2);   // B클래스의 정적 필드
        A.B.method2();      // 메소드
    }
}
