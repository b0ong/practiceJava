package ch06.sec08.exam04;

public class Calculator {
    double areaRectangle(double width) {
        return width * width;
    }

    // 오버로딩
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
