import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextInt();
        // System.out.println(num);

        // type casting
        // int num = (int) (67.56f);
        // System.out.println(num);

        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)a;
        // System.out.println(b); // 257 % 256 = 1
        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;
        // System.out.println(d);

        // byte e = 50;
        // e = e * 2;

        // int number = 'a';
        // System.out.println(number);
        // System.out.println(3 * 1252.25623);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

        input.close();
    }
}
