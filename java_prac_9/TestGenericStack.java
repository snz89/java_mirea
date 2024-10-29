public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Размер стека: " + stack.getSize());
        System.out.println("Стек пуст? " + stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.println("Выброшенный элемент: " + stack.pop());
        }
    }
}
