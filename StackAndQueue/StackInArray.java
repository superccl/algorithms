import java.util.NoSuchElementException;

public class StackInArray<Item> {
    private int N = 0;
    private Item[] s;
    
    public void StaticInArray(int capacity) {
        s = (Item[]) new Object[capacity]; 
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public void push(Item item) {
        s[N++] = item;
    }
    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        Item item = s[--N];
        s[N] = null;
        return item;
    }
}
