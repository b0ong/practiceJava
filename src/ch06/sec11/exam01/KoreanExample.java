package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("961014-1918412", "한국진");


        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);
        k1.name = "김영비";
        System.out.println(k1.name);
    }
}
