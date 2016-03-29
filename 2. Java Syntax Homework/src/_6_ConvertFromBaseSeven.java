import java.util.Scanner;

public class _6_ConvertFromBaseSeven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String num = console.next();
        Integer numToDec = Integer.valueOf(num, 7);
        System.out.println(numToDec);
    }
}
