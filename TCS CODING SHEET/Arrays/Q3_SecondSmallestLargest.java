package Arrays;
/*
 * Find Second Smallest and Second Largest Element in an array

Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input:
 [1]
Output:
 Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
*/

public class Q3_SecondSmallestLargest {
    public static int findSecondSmallest(int arr[]) {
        int secondMinEle = Integer.MAX_VALUE;
        int minEle = Integer.MAX_VALUE;

        if (arr.length < 2) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minEle) {
                    minEle = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < secondMinEle && arr[i] != minEle) {
                    secondMinEle = arr[i];
                }
            }
        }

        return secondMinEle;
    }

    public static int findSecondLargest(int arr[]) {
        int secondMaxEle = Integer.MIN_VALUE;
        int maxEle = Integer.MIN_VALUE;

        if (arr.length < 2) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxEle) {
                    secondMaxEle = maxEle;
                    maxEle = arr[i];
                } else if (arr[i] > secondMaxEle && arr[i] != maxEle) {
                    secondMaxEle = arr[i];
                }
            }
        }

        return secondMaxEle;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 10, 5, 7, 9 };

        System.out.println(
                "Second Smallest : " + findSecondSmallest(arr) + "\nSecond Largest : " + findSecondLargest(arr));
    }
}
