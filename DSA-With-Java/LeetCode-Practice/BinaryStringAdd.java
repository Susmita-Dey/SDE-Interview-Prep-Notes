/*
 * Leetcode question: https://leetcode.com/problems/add-binary/
 * Difficulty: Easy
 * Companies Asked: Facebook
*/

import java.math.BigInteger;
import java.util.*;

public class BinaryStringAdd {
    public static String addBinary(String a, String b) {
        BigInteger bin1 = new BigInteger(a, 2);
        BigInteger bin2 = new BigInteger(b, 2);

        BigInteger sum = bin1.add(bin2);
        return sum.toString(2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binStr1 = sc.nextLine();

        System.out.println("Enter a binary number:");
        String binStr2 = sc.nextLine();

        String binSum = addBinary(binStr1, binStr2);
        System.out.println(binSum);

        sc.close();
    }
}
