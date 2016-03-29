import java.util.Scanner;

public class _3_FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        float b = console.nextFloat();
        float c = console.nextFloat();

        String aToHex = Integer.toHexString(a).toUpperCase();
        System.out.format("|%-10s|%010d|%10.2f|%-10.3f|", aToHex, Integer.parseInt(Integer.toBinaryString(a)), b, c);
    }
}