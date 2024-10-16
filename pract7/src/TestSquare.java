public class TestSquare {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];

        objects[0] = new Circle(2);
        objects[1] = new Rectangle(4, 0);
        objects[2] = new Square(5);
        objects[3] = new Circle(5);
        objects[4] = new Square(6);

        for (var obj : objects) {
            System.out.println("\nОбъект: " + obj);
            System.out.println("Площадь = " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable)obj).howToColor();
            }
        }
    }
}
