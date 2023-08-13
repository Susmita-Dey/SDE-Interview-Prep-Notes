import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // command line thing
        // System.out.println(args[0]);
        // System.out.println(args[1]);

        // printing hello world
        System.out.println("Hello World!");

        // taking input and printing the same
        System.out.println(input.nextInt());
        input.close();
    }
}