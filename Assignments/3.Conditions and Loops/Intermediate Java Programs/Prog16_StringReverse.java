// Q.16. Reverse A String In Java

import java.util.Scanner;

public class Prog16_StringReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String rev = str;
        System.out.println("Reversed string: " + rev);
        sc.close();
    }
}