import java.util.Scanner;

public class _1_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        console.nextLine();
        String[] numbers = console.nextLine().split(" ");
        int[] numInt = new int[numbers.length];

        for (int i = 0; i < n; i++) {
            numInt[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < numInt.length; i++) {
            for (int j = i + 1; j < numInt.length; j++) {

            }
        }
    }
}
