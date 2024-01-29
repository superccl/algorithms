package PriorityQueues;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(5);
        int[] numbers = {7, 6, 5, 4, 3, 2, 1};
        for (int number : numbers) {
            minHeap.offer(number);
            System.out.println(Arrays.toString(minHeap.getHeap()));
        }

        // Print the minimum element in the heap
        System.out.println(minHeap.poll());
    }
}
