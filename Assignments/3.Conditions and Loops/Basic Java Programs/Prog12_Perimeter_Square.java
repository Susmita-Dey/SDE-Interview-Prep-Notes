import java.util.Scanner;

public class Prog12_Perimeter_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square = " + perimeter);
        sc.close();
    }
}
