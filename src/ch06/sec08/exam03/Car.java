package ch06.sec08.exam03;

public class Car {
    // 필드 생성
    int gas;

    // return값이 없는 메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    // return 값이 boolean 타입인 메소드
    boolean isLeftGas() {
        if (gas == 0) {     // gas가 0이면 멈춰라
            System.out.println("gas가 없습니다.");
            return false;   // false를 리턴 메소드 종료
        }
        System.out.println("gas가 있습니다.");   // 아니면 이 메소드 실행
        return true; //true 를 리턴하고 메소드 종료
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달리농 (gas 잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈추농 (gas 잔량:" + gas + ")");
                return;
            }
        }
    }
}
