package Sorting;

public class MergeTwoSortedArray<T> {
    public static <T extends Comparable<T>> T[] merge(T[] a, T[] b) {
        int N = a.length + b.length;
        T[] c = (T[]) new Comparable[N];
        int i = 0, j = 0;
        for (int k = 0; k < N; k++) {
            if (i >= a.length) c[k] = b[j++];
            else if (j >= b.length) c[k] = a[i++];
            else if (a[i].compareTo(b[j]) < 0) c[k] = a[i++];
            else c[k] = b[j++];
        }
        return c;
    }
}
