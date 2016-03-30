import java.util.Scanner;

public class _5_CountAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split("\\W+");

        System.out.print(text.length);
    }
}
