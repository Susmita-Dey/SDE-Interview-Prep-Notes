// Q.5:- Area of Parallelogram 

import java.util.Scanner;

public class Prog5_Area_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b = in.nextDouble();
        double h = in.nextDouble();

        double area = b * h;
        System.out.println("Area of Parallelogram = " + area);
        in.close();
    }
}
