package assignments;

import java.util.Scanner;

public class Prog1_Max_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max, min, num1, num2, num3;
        System.out.println("Input values of 3 numbers one by one:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        max = maximum(num1, num2, num3);
        min = minimum(num1, num2, num3);
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
        in.close();
    }

    // 10 5 15
    static int maximum(int a, int b, int c) {
        int max = 0;
        if (a >= b && a >= c) {// 10>5 and 10>15 //false
            max = a;
        } else if (b >= a && b >= c) {// 5>10 and 5>15 //false
            max = b;
        } else if (c >= a && c >= b) {// 15>10 and 15>5 //true
            max = c;
        }
        return max;
    }

    static int minimum(int a, int b, int c) {
        int min = 0;
        if (a <= b && a <= c) {// 10<5 and 10<15 //false
            min = a;
        } else if (b <= a && b <= c) {// 5<10 and 5<15 //true
            min = b;
        } else if (c <= a && c <= b) {
            min = c;
        }
        return min;
    }
}
