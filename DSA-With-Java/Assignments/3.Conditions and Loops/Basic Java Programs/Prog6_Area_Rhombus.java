// Q.5:- Area of Rhombus 

import java.util.Scanner;

public class Prog6_Area_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();

        double area = (d1 * d2)/2;
        System.out.println("Area of Rhombus = " + area);
        in.close();
    }
}
