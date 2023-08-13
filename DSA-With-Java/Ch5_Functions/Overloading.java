public class Overloading {
    public static void main(String[] args) {
        // fun(67);
        // fun("Kunal Kushwaha");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}

/*
 * In Order To Have Function Overloading,
 * Either the function args should be different or the function return type
 * should be different
 */