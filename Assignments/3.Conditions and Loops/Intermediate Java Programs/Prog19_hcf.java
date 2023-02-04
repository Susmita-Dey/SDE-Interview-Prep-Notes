// Q.19. HCF Of Two Numbers Program

import java.util.Scanner;

public class Prog19_hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int hcf = number1;
        System.err.println("HCF of " + number1 + " and " + number2 + " is = " + hcf);
        sc.close();
    }
}