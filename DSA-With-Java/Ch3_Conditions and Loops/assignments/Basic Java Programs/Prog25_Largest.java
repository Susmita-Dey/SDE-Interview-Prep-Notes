import java.util.Scanner;

public class Prog25_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, max = n;
        System.out.println("Enter as much as numbers you want to check:");
        while (n != 0) {
            n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Largest number is " + max);
        sc.close();
    }
}
