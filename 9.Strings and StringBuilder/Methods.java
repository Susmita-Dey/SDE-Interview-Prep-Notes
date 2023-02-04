import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Susmita Dey Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('s'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println("     Kunal       ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
