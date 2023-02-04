import java.util.*;

public class Prog17_Volume_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double volume = Math.PI * radius * radius * radius / 3;
        System.out.println("Volume of Sphere = " + volume);
        sc.close();
    }
}
