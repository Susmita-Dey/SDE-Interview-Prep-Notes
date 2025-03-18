
import java.util.Scanner;

public class Prog3_Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        eligibleToVote(age);
        sc.close();
    }

    public static void eligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You cannot vote!");
        }
    }
}
