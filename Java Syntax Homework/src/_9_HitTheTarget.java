import java.util.Scanner;

public class _9_HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int theTarget = console.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == theTarget) {
                    System.out.printf(" %d + %d = %d", i, j, theTarget);
                    System.out.println();
                }else if (i - j == theTarget){
                    System.out.printf(" %d - %d = %d", i, j, theTarget);
                    System.out.println();
                }
            }
        }
    }
}
