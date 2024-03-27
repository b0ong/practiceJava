package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {  // 상속받아서 가능
    public D() {
        super();        // A() 생성자 호출
    }

    public void method1() {
        this.field = "value";       // A 필드겂 변경
        this.method();              // A 메소드 호출
    }

//    public void method2() {
//        A a = new A();
//        a.field = "value";
//        a.method();
//    }
}
