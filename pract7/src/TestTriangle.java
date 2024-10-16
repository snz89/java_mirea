import java.util.Scanner;

import exceptions.IllegalTriangleException;

public class TestTriangle {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Введите 3 стороны треугольника: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        System.out.print("Введите цвет: ");
        String color = sc.next();

        System.out.print("Треугольник залит? ");
        boolean isFilled = sc.nextBoolean();
        try {
            Triangle tri = new Triangle(side1, side2, side3);
            tri.setColor(color);
            tri.setFilled(isFilled);

            System.out.println(tri);
            System.out.println("Цвет треугольника: " + tri.getColor());
            System.out.println("Треугольник залит: " + tri.isFilled());
            System.out.printf("Площадь треугольника: %.2f\n", tri.getArea());
            System.out.printf("Периметр треугольника: %.2f\n", tri.getPerimeter());
        } catch (IllegalTriangleException exc) {
            System.out.println(exc.getMessage());
        }

        sc.close();
    }
}
