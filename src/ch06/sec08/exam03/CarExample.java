package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        // myCar 객체 생성
        Car myCar = new Car();

        //  Car 클래스에 있는 setGas에 5를 넣고 myCar객체에 저장해라 gas = 5
        myCar.setGas(5);

        if (myCar.isLeftGas()) {
            System.out.println("출발하농");
            myCar.run();
        }
        System.out.println("밥 주라");
    }
}
