import java.util.NoSuchElementException;

public class StackInDynamicArray {
    private int N = 0;
    private String[] s;

    public void StackInDynamicArray() {
        s = new String[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        if (N == s.length) { resize(s.length * 2); }
        s[N++] = item;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for(int i = 0; i < N; i++) {
            copy[i] = s[i]
        }
        s = copy;
    }

    public String pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        String item = s[--N];
        s[N] = null;
        if (N > 0 && N == s.length / 4) { resize(s.length / 2); }
        return item;
    }
}
