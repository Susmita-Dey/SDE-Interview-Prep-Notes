
import java.util.Scanner;

public class Prog2_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        boolean check = isOddEven(num);

        if (check) {
            System.out.println(num + " is an odd number");
        } else {
            System.out.println(num + " is an even number");
        }
        sc.close();
    }

    public static boolean isOddEven(int number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }
}
