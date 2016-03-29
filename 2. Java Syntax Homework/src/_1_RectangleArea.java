import java.util.Scanner;

public class _1_RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstNum = console.nextInt();
        int secondNum = console.nextInt();

        int rectangleArea = firstNum * secondNum;
        System.out.println(rectangleArea);
    }
}
