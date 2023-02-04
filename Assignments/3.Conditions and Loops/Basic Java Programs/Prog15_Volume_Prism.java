import java.util.Scanner;

public class Prog15_Volume_Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = length * width * height;
        System.out.println("Volume of Prism = " + volume);
        sc.close();
    }
}
