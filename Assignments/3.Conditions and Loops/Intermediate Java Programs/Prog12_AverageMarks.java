// Q.12. Calculate Average Marks 

import java.util.Scanner;

public class Prog12_AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Physics:");
        int phy = sc.nextInt();
        System.out.println("Enter marks for Chemistry:");
        int chem = sc.nextInt();
        System.out.println("Enter marks for Maths:");
        int math = sc.nextInt();
        System.out.println("Enter marks for Biology:");
        int bio = sc.nextInt();
        System.out.println("Enter marks for English:");
        int eng = sc.nextInt();

        double avg = (phy + chem + math + bio + eng) / 5;
        System.out.println("Average Marks = " + avg);
        sc.close();
    }
}
