import java.util.Locale;
import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);

        float firstNum = console.nextFloat();
        float secondNum = console.nextFloat();
        float thirdNum = console.nextFloat();
        float result = getAverage(firstNum, secondNum, thirdNum);
        System.out.printf("%.2f", result);
    }
    public static float getAverage (float firstNum, float secondNum, float thirdNum){
        float average = (firstNum + secondNum + thirdNum) / 3;
        return average;
    }
}