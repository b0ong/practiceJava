package ch06.sec10.exam03;

public class Car {
    int speed;
    void run() {
        System.out.println(speed + "로 달리농");
    }
    static void simulate() {
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate(); // static 정적메소드 호출이라 객체생성 X

        Car myCar = new Car();  // 정적 메소드에 인스턴스 멤버 호출이라 객체 생성필수
        myCar.speed = 60;
        myCar.run();
    }
}
