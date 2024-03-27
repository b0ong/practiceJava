package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("테스라");
        Car yourCar = new Car("모닝");

        myCar.run();
        yourCar.run();
    }
}
