import java.util.Scanner;

public class _2_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        for (int i = 0; i < input.length -1; i++) {
            if (input[i].equals(input[i+1])) {
                System.out.print(input[i] + " ");
            }else{
                System.out.println(input[i]);
            }
        }
        if (input[input.length-2].equals(input[input.length -1])) {
            System.out.print(input[input.length-1]);
        }else{
            System.out.println(input[input.length-1]);
        }

    }
}
