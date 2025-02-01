/* ASKED IN IBM - calculate the sum of all odd bell numbers given in the specific range as input. */

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'sumOfOddBellNumbers' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER lowerNumber
     * 2. INTEGER upperNumber
     */

    public static List<Integer> oddBellNumbers(int n) {
        List<Integer> bell = new ArrayList<>();
        bell.add(1);

        for (int i = 1; i <= n; i++) {
            int prev = bell.get(i - 1);
            List<Integer> temp = new ArrayList<>();
            temp.add(prev);

            for (int j = 1; j <= i; j++) {
                temp.add(temp.get(j - 1) + bell.get(j - 1));
            }
            bell.add(temp.get(i));
        }
        return bell;
    }

    public static void sumOfOddBellNumbers(int lowerNumber, int upperNumber) {
        int sum = 0;
        List<Integer> bellNum = oddBellNumbers(upperNumber);

        for (int i = lowerNumber - 1; i < upperNumber; i++) {
            if (bellNum.get(i) % 2 != 0) {
                sum += bellNum.get(i);
            }
        }

        System.out.println(sum);
    }

}

public class SumOfOddBellNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int lowerNumber = Integer.parseInt(bufferedReader.readLine().trim());

        int upperNumber = Integer.parseInt(bufferedReader.readLine().trim());

        Result.sumOfOddBellNumbers(lowerNumber, upperNumber);

        bufferedReader.close();
    }
}