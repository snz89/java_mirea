import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack {
    private ArrayList<Object> list;
    
    /**
     * Constructs an empty stack with an initial capacity of ten.
     */
    public MyStack() {
        list = new ArrayList<>();
    }

    /**
     * Constructs an empty stack with the specified initial capacity.
     */
    public MyStack(int initialCapacity) {
        list = new ArrayList<>(initialCapacity);
    }

    /**
     * Constructs a new stack by creating a deep copy of another stack.
     */
    public MyStack(MyStack other) {
        list = new ArrayList<>();
        for (Object item : other.list) {
            list.add(cloneItem(item));
        }
    }

    /**
     * Checks if the stack is empty.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     */
    public int getSize() {
        return list.size();
    }

    /**
     * Returns the top element of the stack without removing it.
     */
    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list.get(getSize() - 1);
    }

    /**
     * Removes and returns the top element of the stack.
     */
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.remove(getSize() - 1);
    }

    /**
     * Pushes an element onto the top of the stack.
     */
    public void push(Object o) {
        list.add(o);
    }

    /**
     * Creates a deep copy of the given object if it implements Cloneable.
     */
    private Object cloneItem(Object item) {
        if (item instanceof Cloneable) {
            try {
                return item.getClass().getMethod("clone").invoke(item);
            } catch (Exception e) {
                throw new RuntimeException("Clone not supported", e);
            }
        } else {
            return item;
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
