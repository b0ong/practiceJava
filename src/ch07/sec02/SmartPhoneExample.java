package ch07.sec02;

public class SmartPhoneExample  {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("아이폰", "스페이스 그레이");

        System.out.println("모델: " + myPhone.model);
        System.out.println("생상: " + myPhone.color);

        System.out.println("와이파이상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("에이맨");
        myPhone.receiveVoice("왓섭맨");
        myPhone.hangup();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
