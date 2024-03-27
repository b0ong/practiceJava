package ch06.sec08;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        myCal.powerOn();

        int result1 = myCal.plus(5, 6);
        System.out.println("result1 = " + result1);

        int x = 1;
        int y = 3;
        double result2 = myCal.divide(x,y);
        System.out.println("result2 = " + result2);
    }
}
