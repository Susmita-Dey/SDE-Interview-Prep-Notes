package assignments;

import java.util.Scanner;

public class Prog12_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        boolean ans = isPythagoreanTriplet(arr, arr.length);
        if (ans) {
            // System.out.println(number + " is a Pythagorean triplet.");
            System.out.println("Pythagorean triplet.");
        } else {
            System.out.println("Not a Pythagorean triplet.");
        }
        sc.close();
    }

    static boolean isPythagoreanTriplet(int arr[], int len) {
        return true;
    }
}
