package prac7;

import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle
        System.out.println("Введите данные прямоугольника:");
        System.out.print("Высота: ");
        double height = scanner.nextDouble();
        System.out.print("Ширина: ");
        double width = scanner.nextDouble();
        System.out.print("Цвет: ");
        String color = scanner.next();
        System.out.print("Объект залит? ");
        boolean filled = scanner.nextBoolean();

        Rectangle rectangle = new Rectangle(width, height, color, filled);
        System.out.println(rectangle);

        System.out.println("==================================================");

        // Circle
        System.out.println("Введите данные круга:");
        System.out.print("Радиус: ");
        double radius = scanner.nextDouble();
        System.out.print("Цвет: ");
        color = scanner.next();
        System.out.print("Объект залит? ");
        filled = scanner.nextBoolean();

        Circle circle = new Circle(radius, color, filled);
        System.out.println(circle);

        scanner.close();
    }
}