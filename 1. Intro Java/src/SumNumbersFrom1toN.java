import com.sun.org.apache.bcel.internal.classfile.ConstantLong;

import java.util.Scanner;

public class SumNumbersFrom1toN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();
        Integer sum = 0;
        for (int i = 0; i <= number ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
