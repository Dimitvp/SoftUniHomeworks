import java.util.Scanner;

public class _11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        String[] command = console.nextLine().split(" ");

        int oddOrEven = 0;
        switch (command[2]){
            case "odd": oddOrEven = 1;break;
            case "even": oddOrEven = 0;break;
        }

        int count = 0;
        int elementIndex = 0;

        while (count < Integer.parseInt(command[1]) && elementIndex < numbers.length){
            int number = Integer.parseInt(numbers[elementIndex]);
            if (number % 2 == oddOrEven){
                System.out.printf(number + " " );
                count++;
            }
            elementIndex++;
        }
    }
}
