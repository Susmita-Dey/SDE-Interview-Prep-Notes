public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kushwaha";
        String c = a;

        // ==
        System.out.println(a == b);
        System.out.println(c == a);

        String name1 = new String("Susmita");
        String name2 = new String("Susmita");
        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}
