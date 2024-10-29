import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack<E> extends ArrayList<E> {

    public ArrayListStack() {
        super();
    }

    // Возвращает элемент на вершине стеĸа, не удаляет его
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.get(size() - 1);
    }

    // Добавляет новый элемент на вершину этого стеĸа
    public void push(E o) {
        this.add(o);
    }

    // Возвращает и удаляет элемент на вершине этого стеĸа
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.remove(size() - 1);
    }

    // Возвращает значение true, если этот стеĸ пустой
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}
