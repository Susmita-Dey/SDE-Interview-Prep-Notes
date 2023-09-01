import java.util.Scanner;

public class Prog13_Perimeter_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diagonal1 = sc.nextDouble();
        double diagonal2 = sc.nextDouble();
        double perimeter = 2 * (diagonal1 + diagonal2);
        System.out.println("Perimeter of Rhombus = " + perimeter);
        sc.close();
    }
}
