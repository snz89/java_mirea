import java.util.Queue;
import java.util.LinkedList;

public class StackOnQueue<T> {
    private Queue<T> mainQueue = new LinkedList<>();
    private Queue<T> cacheQueue = new LinkedList<>();
    
    /**
     * Добавляет элемент в стек
     * @param value Добавляемый элемент
     * @return {@code true}, если элемент добавлен, иначе {@code false}
     */
    public boolean push(T value) {
        try {
            while (!mainQueue.isEmpty()) {
                cacheQueue.add(mainQueue.poll());
            }

            mainQueue.add(value);

            while (!cacheQueue.isEmpty()) {
                mainQueue.add(cacheQueue.poll());
            }

            return true;
        }
        catch (IllegalStateException ex) {
            return false;
        }
    }

    /**
     * Удаляет и возвращает верхний элемент стека или {@code null}, если стек пуст.
     * @return Верхний элемент стека или {@code null}, если стек пуст
     */
    public T pop() {
        return mainQueue.poll();
    }

    /**
     * Возвращает, но не удаляет, верхний элемент стека или {@code null}, если стек пуст.
     * @return Верхний элемент стека или {@code null}, если стек пуст
     */
    public T top() {
        return mainQueue.peek();
    }

    /**
     * Возвращает {@code true}, если стек пуст.
     * @return {@code true}, если стек пуст, иначе {@code false}
     */
    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }
    
    /**
     * Возвращает строковое представление стека
     * @return Строковое представление стека
     */
    @Override
    public String toString() {
        Object[] elements = mainQueue.toArray();
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = elements.length - 1; i >= 0; i--) {
            sb.append(elements[i]);
            if (i > 0) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }
}
