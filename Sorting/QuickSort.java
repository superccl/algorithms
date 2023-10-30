package Sorting;

public class QuickSort {
  public static void main(String[] args) {
    Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
    QuickSort.quickSort(arr, 0, arr.length-1);
    System.out.println(arr);
  }
  private static <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {
    int i = lo, j = hi+1;
    T pivot = a[lo];
    while (true) {
      while(a[++i].compareTo(pivot) < 0) {
        if (i == hi) break;
      }
      while (pivot.compareTo(a[--j]) < 0) {
        if (j == lo) break;
      }
      if (i >= j) break;
      exch(a, i, j);
    }
    exch(a, lo, j);
    return j;
  }

  private static <T extends Comparable<T>> void exch(T[] a, int i, int j) {
    T temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
  
  private static <T extends Comparable<T>> void quickSort(T[] a, int lo, int hi) {
    int p = partition(a, lo, hi);
    quickSort(a, lo, p-1);
    quickSort(a, p+1, hi);
  }
}
