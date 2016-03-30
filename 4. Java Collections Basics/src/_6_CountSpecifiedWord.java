import java.util.Scanner;

public class _6_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputText = sc.nextLine().toUpperCase();
        String[] text = inputText.split("\\W+") ;
        String target = sc.nextLine().toUpperCase();

        int count = 0;
        for(int i = 0;i < text.length;i++){
            if(target.equals(text[i])){
                count++;
            }
        }
        System.out.print(count);
    }
}
