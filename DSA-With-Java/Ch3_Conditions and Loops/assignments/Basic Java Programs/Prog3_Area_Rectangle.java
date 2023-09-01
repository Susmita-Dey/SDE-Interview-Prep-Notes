// Q.3:- Area of Rectangle 

import java.util.Scanner;

public class Prog3_Area_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l = in.nextDouble();
        double b = in.nextDouble();

        double area = l * b;
        System.out.println("Area of Rectangle = " + area);
        in.close();
    }
}
