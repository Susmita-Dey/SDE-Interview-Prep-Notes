import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(654);
        // list.add(8765);

        // System.out.println(list.contains(654));
        // System.out.println(list);
        // list.set(0, 99);
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        in.close();
    }
}

// ArrayList in Java is simliar to Vectors in C++
