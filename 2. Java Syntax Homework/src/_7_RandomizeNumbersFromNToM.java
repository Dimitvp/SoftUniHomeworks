import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _7_RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Integer numN = console.nextInt();
        Integer numM = console.nextInt();

        Integer smallerNum = Math.min(numM, numN);
        Integer biggerNum = Math.max(numM,numN);

        Random randomNum = new Random();
        Integer range = (biggerNum - smallerNum) + 1;

        for (int i = smallerNum; i <= biggerNum; i++) {
            Integer randNum = randomNum.nextInt(range) + smallerNum;
            System.out.print(randNum + " ");
        }


//        v 2.0
//        ArrayList <Integer> list = new ArrayList<>();
//
//        while (list.size() < range) {
//            Integer randomNumber = randomNum.nextInt(range) + smallerNum;
//            list.add(randomNumber);
//        }
//        list.forEach(num -> System.out.println(num));
    }
}
