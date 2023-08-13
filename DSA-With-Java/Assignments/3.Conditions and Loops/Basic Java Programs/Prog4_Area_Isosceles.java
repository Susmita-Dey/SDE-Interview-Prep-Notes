// Q.4:- Area of Isosceles Triangle 

import java.util.Scanner;

public class Prog4_Area_Isosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b = in.nextDouble();
        double h = in.nextDouble();

        double area = (b * h)/2;
        System.out.println("Area of Isosceles Triangle = " + area);
        in.close();
    }
}
