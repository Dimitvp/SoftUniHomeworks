import java.util.Scanner;

public class _4_CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double firstFormula = ((a*a) + (b*b))/((a*a)-(b*b));
        double firstFormulaPow = (a + b + c)/(Math.sqrt(c));

        double firstFormulaEnd = Math.pow(firstFormula, firstFormulaPow);

        double secondFormula = ((a*a) + (b*b) - (c*c*c));
        double secondFormulaPow = a - b;

        double secondFormulaEnd = Math.pow(secondFormula,secondFormulaPow);

        double difference = Math.abs(((a + b + c)/3)-((firstFormulaEnd + secondFormulaEnd)/2));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormulaEnd, secondFormulaEnd, difference);
    }
}
