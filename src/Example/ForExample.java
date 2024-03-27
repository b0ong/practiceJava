package Example;

public class ForExample {
    public static void main(String[] args) {
        int[] score = {90, 25, 67, 45, 80};

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 60) {
                System.out.println(i+1 + "번 학생은 합격입니다.");
            } else{
                System.out.println(i+1 + "번 학생은 불합격입니다.");
            }
        }
    }
}
