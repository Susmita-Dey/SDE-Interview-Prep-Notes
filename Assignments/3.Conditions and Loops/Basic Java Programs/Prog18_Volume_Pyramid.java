import java.util.*;

public class Prog18_Volume_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height / 3;
        System.out.println("Volume of Pyramid = " + volume);
        sc.close();
    }
}
