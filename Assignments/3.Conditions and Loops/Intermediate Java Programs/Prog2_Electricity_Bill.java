// Q.2. Calculate Electricity Bill 

import java.util.Scanner;

public class Prog2_Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int rate = sc.nextInt();
        int bill = 0;
        if (units <= 50) {
            bill = units * rate;
        } else if (units > 50 && units <= 100) {
            bill = (50 * rate) + ((units - 50) * (rate + (rate / 2)));
        } else if (units > 100 && units <= 200) {
            bill = (50 * rate) + ((50 * (rate + (rate / 2))) + ((units - 100) * (rate + (rate / 2) + (rate / 4))));
        } else {
            bill = (50 * rate) + ((50 * (rate + (rate / 2))) + ((50 * (rate + (rate / 2) + (rate / 4)))
                    + ((units - 200) * (rate + (rate / 2) + (rate / 4) + (rate / 8)))));
        }
        System.out.println("Bill is " + bill);
        sc.close();
    }
}
