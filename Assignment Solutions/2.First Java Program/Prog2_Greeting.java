// Q:- Take name as input and print a greeting message for that name. 

import java.util.Scanner;

public class Prog2_Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of name 
        System.out.print("Enter your full name:- ");
        String name = sc.nextLine();
        
        System.out.println("Good morning, " + name + ". Welcome to Our Community.");
        
        sc.close();
    }
}
