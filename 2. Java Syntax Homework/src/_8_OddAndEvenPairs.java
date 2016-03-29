
import java.util.Scanner;

public class _8_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");

        int collectionLength = numbers.length;

        if (collectionLength %2 != 0) {
            System.out.println("Invalid length");
        }
        else{
            for (int i = 0; i < numbers.length -1; i+=2) {

                int firstNum = Integer.parseInt(numbers[i]);
                int secondNum = Integer.parseInt(numbers[i + 1]);

                if (firstNum % 2 ==0 && secondNum % 2 == 0) {
                    System.out.printf("%s, %s -> both are even\n",numbers[i],numbers[i+1]);
                }
                else if (firstNum % 2 != 0 && secondNum % 2 != 0){
                    System.out.printf("%s, %s -> both are odd\n",numbers[i],numbers[i+1]);
                }
                else {
                    System.out.printf("%s, %s -> different\n",numbers[i],numbers[i+1]);
                }
            }
        }
    }
}
