package ch07.sec08.exam02;

public class DreiverExample {
    public static void main(String[] args) {
        Deiver deiver = new Deiver();

        Bus bus = new Bus();
        deiver.drive(bus);

        Taxi taxi = new Taxi();
        deiver.drive(taxi);

    }
}
