public class Shadowing {
    static int x = 90; // this will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 2 is shadowed by this
        // System.out.println(x); // scope wil begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}

/*
 * NOTE:-
 * What is Shadowing in Java?
 * 
 */