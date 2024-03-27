package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//        Parent타입으로 객체를 만들어서 Child꺼는 사용 불가능

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
