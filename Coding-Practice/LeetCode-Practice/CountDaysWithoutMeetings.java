/*
 * Leetcode question: https://leetcode.com/problems/count-days-without-meetings/
 * Difficulty level: Medium
 * Time complexity: O(Nlog(N))
 * Space complexity: O(log N) or O(N)
 */

import java.util.*;

public class CountDaysWithoutMeetings {
    public static int countDays(int days, int[][] meetings) {
        int meetingEnd = 0, daysWithoutMeetings = 0;

        // Sort meetings based on stating times
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            // Add current range of days without a meeting
            if (start > meetingEnd + 1) {
                daysWithoutMeetings += start - meetingEnd - 1;
            }

            // Update latest meeting end
            meetingEnd = Math.max(meetingEnd, end);
        }

        // Add all days after the last day of meetings
        daysWithoutMeetings += days - meetingEnd;

        return daysWithoutMeetings;
    }

    public static void main(String args[]) {
        int days = 10;
        int[][] meetings = { { 5, 7 }, { 1, 3 }, { 9, 10 } };

        System.out.println("No of days: " + countDays(days, meetings));
    }
}