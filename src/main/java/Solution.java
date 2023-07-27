import java.util.*;

public class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long result = 0L;
        Arrays.sort(batteries);

        long left = 0L;
        long right = 1_000_000_000;
        long mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (isPossible(n, batteries, mid)) {
                result = Math.max(result, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return result;
    }

    private boolean isPossible(int n, int[] batteries, long time) {
        long currSum = 0;
        int numOfComputers = 0;
        for (int battery : batteries) {
            currSum += battery;
            if (currSum >= time) {
                numOfComputers++;

                currSum -= time;
            }
        }
        return numOfComputers >= n;
    }
}

