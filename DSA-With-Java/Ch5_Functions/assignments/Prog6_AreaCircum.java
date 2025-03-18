
import java.util.Scanner;

public class Prog6_AreaCircum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        int radius = sc.nextInt();
        float area = getArea(radius);
        float circumference = getCircumference(radius);
        System.out.println("Area of Circle = " + area);
        System.out.println("Circumference of Circle = " + circumference);
        sc.close();
    }

    public static float getArea(int r) {
        return (float) (3.14 * r * r);
    }

    public static float getCircumference(int r) {
        return (float) (2 * 3.14 * r);
    }
}
