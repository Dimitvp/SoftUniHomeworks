import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        String order = console.next();
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        List<String> numbersList = Arrays.stream(input)
                .sorted()
                .collect(Collectors.toList());
        if (order.equals("Ascending")) {
            System.out.println(numbersList);
        }else if (order.equals("Descending")){
            numbersList.sort((f1, f2) -> f2.compareTo(f1));
            System.out.println(numbersList);
        }

    }


}
