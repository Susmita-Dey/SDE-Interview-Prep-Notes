public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swapping two numbers 
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b);
        System.out.println("a = " + a + " b = " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
