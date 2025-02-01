/*
 * Q: Find the total minutes of exercise done and it's average for a week.
 * 
 * Input:
 * Day 1 exercise duration: 25
 * Day 2 exercise duration: 26
 * Day 3 exercise duration: 23
 * Day 4 exercise duration: 15
 * Day 5 exercise duration: 14
 * Day 6 exercise duration: 38
 * Day 7 exercise duration: 44
 * 
 * Result: 185 26.4
 * ASKED IN TCS NQT - FIRST SHIFT - 03/10/2024
*/

import java.util.*;

public class WeeklyExerciseTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTime = 0;
        int timePerDay[] = new int[7];

        for (int i = 0; i < timePerDay.length; i++) {
            System.out.print("Day " + (i + 1) + " exercise duration: ");
            timePerDay[i] = sc.nextInt();
        }

        for (int i = 0; i < timePerDay.length; i++) {
            totalTime += timePerDay[i];
        }
        double averageTime = ((double) totalTime) / timePerDay.length;

        System.out.println("Result: " + totalTime + " " + (Math.round(averageTime * 10.0) / 10.0));

        sc.close();
    }
}
