package ch06.sec07.exam05;

public class Car {
    String company = "테슬라";
    String model;
    String color;
    int maxSpeed;


    Car(String model) {
        this(model, "검정", 300);
    }

    Car(String model, String color) {
        this(model, color, 300);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
