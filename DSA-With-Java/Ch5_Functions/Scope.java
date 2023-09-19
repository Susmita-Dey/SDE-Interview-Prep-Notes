// Video ended at 51:05 

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";

        // block scope
        {
            // int a =78; // already initialised outside the block in the same method, hence
            // you cannot initialise again.
            a = 100; // reassign the original ref. variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Susmita";
            System.out.println(name);
            // values initialised in this block, will reamin in the block.
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); // cannot use outside the block

        // System.out.println(num); // not accessible

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            // int a = 10;
            a = 1000; // changing the value
        }
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

        // these variables will only be valid in this function scope only.
    }
}

/*
 * NOTE:-
 * Scope of variables & objects:-
 * 
 * Anything(variables, objects) that is declared and initialised outside the block can be used inside the block.
 * On the other hand anything(variables, objects) that is declared and
 * initialised inside the block cannot be used outside of the block; but can definitely be declared and re-initialised the same outside the block(after the block).
 * Functions,for loops, blocks all have their own scope.
 */