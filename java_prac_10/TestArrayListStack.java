import java.util.Scanner;

public class TestArrayListStack {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var stack = new ArrayListStack();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            stack.push(sc.nextLine());
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        
        sc.close();
    }
}
