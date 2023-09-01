import java.util.*;

public class Prog8_Perimeter_Circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle = " + perimeter);
        sc.close();
    }
}
