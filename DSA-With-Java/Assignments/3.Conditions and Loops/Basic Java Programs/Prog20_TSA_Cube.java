// Total Surface Area Of Cube 
import java.util.*;

public class Prog20_TSA_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double surface_area = 6 * length * length;
        System.out.println("Total Surface Area Of Cube = " + surface_area);
        sc.close();
    }
}
