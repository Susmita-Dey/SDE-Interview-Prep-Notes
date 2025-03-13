import java.util.Scanner;

public class ExerciseTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] exercise = new String[7];

        for (int i = 0; i < 7; i++) {
            exercise[i] = sc.nextLine();
        }

        int totalTime = 0;

        for (String day : exercise) {
            int n = day.length();
            String num = "";

            for (int i = n - 1; i >= 0; i--) {
                if (day.charAt(i) == ' ') {
                    break;
                }
                num = day.charAt(i) + num;
            }

            totalTime += Integer.parseInt(num);
        }

        System.out.println("Average: " + (totalTime / 7.0));
        System.out.println("Sum: " + totalTime);
        sc.close();
    }
}
