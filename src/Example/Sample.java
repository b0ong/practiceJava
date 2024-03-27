package Example;

public class Sample {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 쳤습니다.");
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다");
            }
        }
    }
}
