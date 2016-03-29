import java.util.Scanner;

public class _5_ConvertFromDecimalSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Integer num = console.nextInt();

        System.out.println(Integer.toString(num, 7));
    }
}
