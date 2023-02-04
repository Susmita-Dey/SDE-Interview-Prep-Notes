import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);

        Scanner in = new Scanner(System.in);
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
        in.close();
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}
