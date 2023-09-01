// Curved Surface Area Of Cylinder
import java.util.*;

public class Prog19_CSA_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double surface_area = 2 * Math.PI * radius * height;
        System.out.println("Curved Surface Area Of Cylinder = " + surface_area);
        sc.close();
    }
}
