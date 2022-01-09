// Q: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Prog4_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        
        // input two numbers
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        // take the operator as input
        System.out.print("Enter the operator: ");
        char op = in.next().trim().charAt(0);

        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                ans = num1 / num2;
            }
        } else {
            System.out.println("Invalid operation");
        }
        System.out.println(ans);

        in.close();
    }
}
