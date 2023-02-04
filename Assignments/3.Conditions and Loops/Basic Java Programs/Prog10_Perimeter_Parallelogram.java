import java.util.*;

public class Prog10_Perimeter_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double perimeter = 2 * (base + height);
        System.out.println("Perimeter of Parallelogram = " + perimeter);
        sc.close();
    }
}