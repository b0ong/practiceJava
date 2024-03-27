package ch07.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("아이폰", "스페이스 그레이");

        System.out.println("모댈: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
