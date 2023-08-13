public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNums(nums));
        // System.out.println(digits2(3136565));
    }

    static int findNums(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether the number contains the even number of digits or
    // not
    static boolean even(int num) {
        int numberOfDigits = digits(num);

        // if (numberOfDigits % 2 == 0) {
        // return true;
        // }
        // return false;

        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // shortcut to find the number of digits
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
