import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 56, 87, 23, 45);
        // multiple(2, 3, "Kunal", "Susmita", "jfjgukg");
        demo(2, 3, 4);
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {

    } // multiple variable arguments

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    } // ...variable -> creates an array of varying length
}

// NOTE:-variable length arguments must be declared at last of all other
// variables.