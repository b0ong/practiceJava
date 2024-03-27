package ex;

import org.w3c.dom.ls.LSOutput;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num+=2;
            count++;
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
        }
    }

