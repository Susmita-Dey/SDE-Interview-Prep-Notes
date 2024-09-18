/* 
 * Leetcode question: https://leetcode.com/problems/roman-to-integer/
*/

class RomanToInteger {
    public static int romanToInt(String s) {
        int len = s.length();
        int sum = 0, current = 0, previous = 0;

        for (int i = len - 1; i >= 0; i--) {
            current = romanNum(s.charAt(i));
            if (i == len - 1) {
                sum += current;
            } else {
                if (current < previous) {
                    sum -= current;
                } else {
                    sum += current;
                }
            }
            previous = current;
        }
        return sum;
    }

    public static int romanNum(char ch) {
        int num = 0;
        switch (ch) {
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int numInt = romanToInt(s);
        System.out.println("Integer Number: " + numInt);
    }
}