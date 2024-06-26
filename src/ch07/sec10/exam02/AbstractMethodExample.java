package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

//        매개변수의 다형성
        animalSound(new Dog()); // 자동 타입변환
        animalSound(new Cat()); // 자동 타입변환
    }

    public static void animalSound(Animal animal) {
        animal.sound();     // 재정의된 메소드 호출
    }
}
