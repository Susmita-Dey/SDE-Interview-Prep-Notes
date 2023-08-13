import java.util.Scanner;

public class Prog24_Zero_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, sum = 0;
        System.out.println("Enter as much as numbers you want to add");
        while (n != 0) {
            n = sc.nextInt();
            sum = sum + n;
        }
        System.out.println("Sum of all numbers is " + sum);
        sc.close();
    }
}


// Q:- Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
// Input:
// Enter as much as numbers you want to add
// 1
// 2
// 3
// 4
// 5
// 6


// Output:
// Sum of all numbers is 18

