import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String number = console.next();
        String ghettoNum = "";
        for (int i = 0; i < number.length(); i++) {
            switch (number.charAt(i)){
                case '0': ghettoNum = "Gee"; break;
                case '1': ghettoNum = "Bro"; break;
                case '2': ghettoNum = "Zus"; break;
                case '3': ghettoNum = "Ma"; break;
                case '4': ghettoNum = "Duh"; break;
                case '5': ghettoNum = "Yo"; break;
                case '6': ghettoNum = "Dis"; break;
                case '7': ghettoNum = "Hood"; break;
                case '8': ghettoNum = "Jam"; break;
                case '9': ghettoNum = "Mack"; break;
                default: System.out.println("Invalid"); break;
            }
            System.out.print(ghettoNum);
        }

    }

}

