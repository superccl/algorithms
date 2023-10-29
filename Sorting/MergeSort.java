package Sorting;

public class MergeSort {
    public static <T extends Comparable<T>> void sort(T[] a, T[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid+1, hi);
    }
    public static <T extends Comparable<T>> void merge(T[] a, T[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid;
        for (int k = lo; k <= hi; k++) {
            if (i >= mid) {
                a[k] = aux[j];
                j++;
            } else if (j > hi) {
                a[k] = aux[i];
                i++;
            } else if (aux[i].compareTo(aux[j]) <= 0) {
                a[k] = aux[i];
                i++;
            } else {
                a[k] = aux[j];
                j++;
            }  
        }
    }
}
