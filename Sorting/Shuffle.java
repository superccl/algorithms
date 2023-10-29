package Sorting;

import java.util.Random;

public class Shuffle {
    public static <T> void abc(T[] a) {
        int N = a.length;
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            int r = rand.nextInt(i + 1);
            swap(a, i, r);
        }
    }


    private static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
