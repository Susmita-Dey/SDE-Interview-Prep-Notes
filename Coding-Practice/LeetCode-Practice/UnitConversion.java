/*
 * Q2. Unit Conversion I
Medium
4 pt.
There are n types of units indexed from 0 to n - 1. You are given a 2D integer array conversions of length n - 1, where conversions[i] = [sourceUniti, targetUniti, conversionFactori]. This indicates that a single unit of type sourceUniti is equivalent to conversionFactori units of type targetUniti.

Return an array baseUnitConversion of length n, where baseUnitConversion[i] is the number of units of type i equivalent to a single unit of type 0. Since the answer may be large, return each baseUnitConversion[i] modulo 109 + 7.

 

Example 1:

Input: conversions = [[0,1,2],[1,2,3]]

Output: [1,2,6]

Explanation:

Convert a single unit of type 0 into 2 units of type 1 using conversions[0].
Convert a single unit of type 0 into 6 units of type 2 using conversions[0], then conversions[1].

Example 2:

Input: conversions = [[0,1,2],[0,2,3],[1,3,4],[1,4,5],[2,5,2],[4,6,3],[5,7,4]]

Output: [1,2,3,8,10,6,30,24]

Explanation:

Convert a single unit of type 0 into 2 units of type 1 using conversions[0].
Convert a single unit of type 0 into 3 units of type 2 using conversions[1].
Convert a single unit of type 0 into 8 units of type 3 using conversions[0], then conversions[2].
Convert a single unit of type 0 into 10 units of type 4 using conversions[0], then conversions[3].
Convert a single unit of type 0 into 6 units of type 5 using conversions[1], then conversions[4].
Convert a single unit of type 0 into 30 units of type 6 using conversions[0], conversions[3], then conversions[5].
Convert a single unit of type 0 into 24 units of type 7 using conversions[1], conversions[4], then conversions[6].
 

Constraints:

2 <= n <= 105
conversions.length == n - 1
0 <= sourceUniti, targetUniti < n
1 <= conversionFactori <= 109
It is guaranteed that unit 0 can be converted into any other unit through a unique combination of conversions without using any conversions in the opposite direction.
 */

import java.util.*;

public class UnitConversion {
    public int[] baseUnitConversions(int[][] conversions) {
        int n = conversions.length + 1;
        long[] baseUnitConversion = new long[n];
        baseUnitConversion[0] = 1;
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] conversion : conversions) {
            int sourceUnit = conversion[0];
            int targetUnit = conversion[1];
            int conversionFactor = conversion[2];

            graph.putIfAbsent(sourceUnit, new ArrayList<>());
            graph.putIfAbsent(targetUnit, new ArrayList<>());

            graph.get(sourceUnit).add(new int[] { targetUnit, conversionFactor });
            graph.get(targetUnit).add(new int[] { sourceUnit, 1 / conversionFactor });
        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int currentUnit = queue.poll();
            for (int[] neighbor : graph.get(currentUnit)) {
                int neighborUnit = neighbor[0];
                long conversionFactor = neighbor[1];
                if (!visited[neighborUnit]) {
                    baseUnitConversion[neighborUnit] = (baseUnitConversion[currentUnit] * conversionFactor)
                            % 1000000007;
                    visited[neighborUnit] = true;
                    queue.add(neighborUnit);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            baseUnitConversion[i] = baseUnitConversion[i] % 1000000007;
        }
        return Arrays.stream(baseUnitConversion).mapToInt(i -> (int) i).toArray();
    }

    public static void main(String[] args) {

    }
}