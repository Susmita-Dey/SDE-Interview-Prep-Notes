package NumberSystem;

import java.util.*;

public class Q2_DecimalTobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int remainder, quotient = num;
        String binaryNum = "";

        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }

        System.out.println(binaryNum);

        sc.close();
    }
}
