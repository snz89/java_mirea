import java.util.Scanner;

public class TestArrayListStack {
    public static void main(String[] args) {
        ArrayListStack<String> stack = new ArrayListStack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            stack.push(input);
        }

        System.out.println("Строки в обратном порядке:");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }

        sc.close();
    }
}
