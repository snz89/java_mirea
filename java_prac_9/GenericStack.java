import java.util.EmptyStackException;

public class GenericStack<E> {
    E list[];
    int capacity;
    int size;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        list = (E[]) new Object[10];
        capacity = 10;
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public GenericStack(int capacity) {
        list = (E[]) new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public int getSize() {
        return this.size;
    }

    // Возвращает элемент на вершине стеĸа, не удаляет его
    public E peek() throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    // Добавляет новый элемент на вершину этого стеĸа
    public void push(E o) {
        if (size >= capacity) {
            resize();
        }
        list[size++] = o;
    }

    // Возвращает и удаляет элемент на вершине этого стеĸа
    public E pop() throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E popped = list[--size];
        list[size] = null;
        return popped;
    }
    
    // Возвращает значение true, если этот стеĸ пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Увеличивается стек
    public void resize() {
        @SuppressWarnings("unchecked")
        E[] newList = (E[]) new Object[capacity * 2];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
        capacity *= 2;
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += list[i] + " ";
        }
        return result;
    }
}
