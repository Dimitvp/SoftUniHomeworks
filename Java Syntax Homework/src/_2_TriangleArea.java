import java.util.Scanner;

public class _2_TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int aX = console.nextInt();
        int aY = console.nextInt();
        int bX = console.nextInt();
        int bY = console.nextInt();
        int cX = console.nextInt();
        int cY = console.nextInt();

        System.out.println(getTriangleArea(aX, aY, bX, bY, cX, cY));
    }

    public static int getTriangleArea (int aX, int aY, int bX, int bY, int cX, int cY) {
        int triangleArea = (aX*(bY - cY)+ bX*(cY - aY)+ cX*(aY - bY))/ 2;
        return triangleArea;
    }
}