import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_FilterArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] elements = console.nextLine().split(" ");

        List<String> longStrings = Arrays.stream(elements)
                .filter(_1_FilterArray :: strLength)
                .collect(Collectors.toList());

        System.out.println(longStrings);

    }
    private static boolean strLength(String str) {
            if (str.length() <= 3){
                return false;
            }
        return true;
    }
}
