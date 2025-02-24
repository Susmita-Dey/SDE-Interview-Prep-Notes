import java.util.HashMap;

public class CountSubArraysWithTarget {
    public static int countSubArraysMakingTarget(int[] arr, int target) {
        HashMap<Integer, Integer> hmp = new HashMap<>();

        int prefixSum = 0, count = 0;
        hmp.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - target;

            if (hmp.containsKey(remove)) {
                count += hmp.get(remove);
            }

            hmp.put(prefixSum, hmp.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 1, 3, 3, 1, 4 };
        int k = 7;

        System.out.println(countSubArraysMakingTarget(arr, k));
    }
}
