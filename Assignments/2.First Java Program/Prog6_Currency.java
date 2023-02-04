// Q:- Input currency in rupees and output in USD. 

import java.util.Scanner;

public class Prog6_Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter currency in rupees:- ");
        int rupees = sc.nextInt();
        
        // converting rupees into dollar 
        double USD = rupees * 0.013;
        System.out.println(rupees + " INR = " + USD + " USD.");

        sc.close();
    }
}
