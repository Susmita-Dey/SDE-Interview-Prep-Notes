// Q: Count the number of 5's present in the given number. 

public class CountNums {
    public static void main(String[] args) {
        int n = 455365;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
