package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {

//        Phone phone = new Phone(); --> 안됨
        SmartPhone smartPhone = new SmartPhone("한국진");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
