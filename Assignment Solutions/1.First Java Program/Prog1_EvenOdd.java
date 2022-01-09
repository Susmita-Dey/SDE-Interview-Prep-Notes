import java.util.Scanner;

public class Prog1_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of number
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        // checking for odd or even number
        if (n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }

        sc.close(); // closing the scanner class
    }
}