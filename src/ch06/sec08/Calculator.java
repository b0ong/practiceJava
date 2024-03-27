package ch06.sec08;

public class Calculator {
    void powerOn(){
        System.out.println("전원키농");
    }
    void powerOff() {
        System.out.println("전원끄농 ㅠ ");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }
}
