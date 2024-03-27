package ch07.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;     //Phone 으로 부터 상속받은 필드
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;   // 본인 클래스 메소드
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷을 연결합니다.");
    }
}
