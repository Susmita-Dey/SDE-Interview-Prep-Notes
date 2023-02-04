// Q.2:- Area of Triangle 

import java.util.Scanner;

public class Prog2_Area_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b = in.nextDouble();
        double h = in.nextDouble();

        double area = 0.5 * b * h;
        System.out.println("Area of Triangle = " + area);
        in.close();
    }
}
