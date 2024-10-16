public class TestCompare {
    public static void main(String[] args) {
        GeometricObject o1 = new Circle(10);
        GeometricObject o2 = new Circle(11);
        GeometricObject r1 = new Rectangle(20, 10);
        
        // Сравнение кругов
        if (o1.compareTo(o2) > 0) {
            System.out.println("Круг 1 > круг 2:");
            System.out.println(o1);
        }
        else if (o1.compareTo(o2) < 0) {
            System.out.println("Круг 2 > круг 1:");
            System.out.println(o2);
        }
        else System.out.println("Оба круга равны");

        System.out.println();

        // Сравнение круга и прямоугольника
        if (o1.compareTo(r1) > 0) {
            System.out.println("Круг 1 > прямоугольник:");
            System.out.println(o1);
        }
        else if (o1.compareTo(r1) < 0) {
            System.out.println("Прямоугольник > круг 1");
            System.out.println(r1);
        }
        else {
            System.out.println("Фигуры равны");
        }

        System.out.println();
        System.out.printf("Площадь круга 1 = %.2f\n", o1.getArea());
        System.out.printf("Площадь круга 2 = %.2f\n", o2.getArea());
        System.out.printf("Площадь прямоугольника = %.2f\n", r1.getArea());
    }
}
