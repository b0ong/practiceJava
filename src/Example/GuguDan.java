package Example;

public class GuguDan {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("=======" + i + "단=======");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " x " + j + " = " + (i * j));
                if (j < 9) {
                    System.out.print(" , ");
                }
            }
                System.out.println("\n");
        }
    }
}
