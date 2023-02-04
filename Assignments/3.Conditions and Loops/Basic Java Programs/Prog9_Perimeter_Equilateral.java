import java.util.*;

public class Prog9_Perimeter_Equilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle = " + perimeter);
        sc.close();
    }
}
