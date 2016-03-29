import java.util.Scanner;

public class _10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");

        System.out.println(characterMultiplier(input[0], input[1]));
    }

    private static int characterMultiplier (String string1, String string2){
        int longerStr = Math.max(string1.length(), string2.length());

        int sum = 0;

        for (int i = 0; i < longerStr; i++) {
            int char1 = 1;
            int char2 = 1;
            if (i < string1.length()) {
                char1 = string1.charAt(i);
            }
            if (i < string2.length()) {
                char2 = string2.charAt(i);
            }
            sum += char1 * char2;
        }


        return sum;
    }
}
