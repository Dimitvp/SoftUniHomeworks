import java.util.Scanner;

public interface _3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");

        int counter = 1;
        int maxCounter = 1;
        int index = 0;
        for(int i = 1;i < input.length;i++){
            if(input[i].equals(input[i-1])){
                counter++;
            }else{
                counter = 1;
            }

            if(counter > maxCounter){
                maxCounter = counter;
                index = i;
            }
        }

        for(int i = 0;i < maxCounter;i++){
            System.out.print(input[index] + " ");
        }
    }
}
