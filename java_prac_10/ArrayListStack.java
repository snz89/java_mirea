import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack extends ArrayList<Object> {

    /**
     * Constructs an empty stack with an initial capacity of ten.
     */
    public ArrayListStack() {
        super();
    }

    /**
     * Constructs an empty stack with the specified initial capacity.
     */
    public ArrayListStack(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Constructs a new stack with a deep copy.
     */
    public ArrayListStack(ArrayListStack other) {
        super();
        for (Object element : other) {
            if (element instanceof Cloneable) {
                try {
                    this.add(element.getClass().getMethod("clone").invoke(element));
                } catch (Exception e) {
                    throw new RuntimeException("Ошибка при клонировании элемента", e);
                }
            } else {
                this.add(element);
            }
        }
    }

    /**
     * Checks if the stack is empty.
     */
    public boolean isEmpty() {
        return super.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     */
    public int getSize() {
        return super.size();
    }

    /**
     * Returns the top element of the stack without removing it.
     */
    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.get(size() - 1);
    }

    /**
     * Removes and returns the top element of the stack.
     */
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        return this.remove(size() - 1);
    }

    /**
     * Pushes an element onto the top of the stack.
     */
    public void push(Object o) {
        this.add(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
