public class PassingExample {
    public static void main(String[] args) {
        String chacha = "Iron Man";
        greet(chacha);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object
    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}
