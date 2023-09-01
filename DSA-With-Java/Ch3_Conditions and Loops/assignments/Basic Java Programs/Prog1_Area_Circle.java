// Q.1: Area of Circle 

import java.util.Scanner;

public class Prog1_Area_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();

        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
        in.close();
    }
}