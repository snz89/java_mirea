public class TestStackOnQueue {
    public static void main(String[] args) {
        StackOnQueue<Integer> stack = new StackOnQueue<>();

        stack.push(1);
        stack.push(2);

        System.out.println("Стек до операций: " + stack);

        System.out.println("Объект на вершине: " + stack.top());
        System.out.println("Объект на вершине: " + stack.pop());
        System.out.println("Стек пуст: " + stack.isEmpty());
        System.out.println("Стек: " + stack);
    }
}
