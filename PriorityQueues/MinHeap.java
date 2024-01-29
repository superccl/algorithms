package PriorityQueues;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinHeap {
  private int[] heap;
  private int size;
  private int k;
  public MinHeap(int k) {
    this.k = k;
    size = 0;
    heap = new int[k+1];
  }

  public void offer(int val) {
    if (size == heap.length) {
      heap = Arrays.copyOf(heap, size * 2);
    }
      heap[size] = val;
      bubbleUp(size);
      size++;
      if (size > this.k) {
        poll();
      }
  }

  public int poll() {
      if (size == 0) {
          throw new NoSuchElementException("Heap is empty");
      }
      int min = heap[0];
      heap[0] = heap[size - 1];
      size--;
      bubbleDown(0);
      return min;
  }

  private void bubbleUp(int i) {
    int parent = parent(i);
    while (i > 0 && heap[i] < heap[parent]) {
      swap(i, parent);
      i = parent;
      parent = parent(i);
    }
  }

  private void bubbleDown(int i) {
    int smallest = i;
    int left = left(i);
    int right = right(i);
    if (left < size && heap[left] < heap[smallest]) {
      smallest = left;
    }
    if (right < size && heap[right] < heap[smallest]) {
      smallest = right;
    }
    if (i != smallest) {
      swap(i, smallest);
      bubbleDown(smallest);
    }
  }

  public int[] getHeap() {
    return Arrays.copyOf(heap, size);
}

  private int parent(int i) { return (i - 1) / 2; }
  private int left(int i) { return 2 * i + 1; }
  private int right(int i) { return 2 * i + 2;}
  private void swap(int i, int j) {
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }
}


