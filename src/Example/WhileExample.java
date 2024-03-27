package Example;

public class WhileExample {
    public static void main(String[] args) {
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈을 받았으니 커피준다");
            coffee--;
            System.out.println("남은 커피 : " + coffee);
            if (coffee == 0) {
                System.out.println("커피가 없습니다.");
                break;
            }
        }
    }
}
