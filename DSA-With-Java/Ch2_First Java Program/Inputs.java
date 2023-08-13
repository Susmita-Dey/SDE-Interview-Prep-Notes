import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Please enter some input: ");
        // int rollNo = input.nextInt();
        // System.out.println("Your roll number is " + rollNo);
        
        // Literals
        // int a = 10;
        int b = 234_000_000; // this means 234M
        System.out.println(b);

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

        input.close();
    }
}
