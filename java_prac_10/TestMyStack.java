import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        // var stack = new MyStack();

        // System.out.println("Введите 5 строк:");
        // for (int i = 0; i < 5; i++) {
        //     stack.push(sc.nextLine());
        // }

        // System.out.println("Строки в обратном порядке:");
        // while (!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }

        var stack = new MyStack();
        stack.push(new StringBuilder("h"));

        var stack2 = new MyStack(stack);

        var h = (StringBuilder)stack.peek();
        h.append("ello");

        System.out.println(stack);
        System.out.println(stack2);

        sc.close();
    }
}
