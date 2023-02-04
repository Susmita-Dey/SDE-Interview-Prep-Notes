//Q.7 Area of equilateral triangle
//Formula:- Area = √3/4 × (side)2 square units

import java.util.*;

public class Prog7_Area_Equilateral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("Area of Equilateral Triangle = " + area);
        sc.close();
    }
}
