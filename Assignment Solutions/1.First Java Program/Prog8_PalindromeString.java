// Q:- To find out whether the given String is Palindrome or not. 

import java.util.Scanner;

public class Prog8_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:- ");
        String str = sc.next();
        int l = str.length(); // calculating the length of the original string
        String rev = "";

        // reversing the string and storing it to another string variable
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // checking if both are equal or not
        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        sc.close();
    }
}
