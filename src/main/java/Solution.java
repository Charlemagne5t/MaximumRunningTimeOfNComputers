import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public long maxRunTime(int n, int[] batteries) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int b : batteries) {
            priorityQueue.offer(b);
        }
        long count = 0;

        while (true) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {

                if (priorityQueue.isEmpty()) {
                    return count;
                }
                int battery = priorityQueue.poll();
                if (battery != 0) {
                    battery--;
                    if (battery != 0) {
                        temp.add(battery);
                    }
                }

            }
            priorityQueue.addAll(temp);
            count++;
        }


    }
}
