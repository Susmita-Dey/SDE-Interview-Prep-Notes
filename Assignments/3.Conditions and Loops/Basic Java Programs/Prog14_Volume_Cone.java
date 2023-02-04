import java.util.Scanner;

public class Prog14_Volume_Cone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = (3.14 * radius * radius * height) / 3;
        System.out.println("Volume of Cone = " + volume);
        sc.close();
    }

}
