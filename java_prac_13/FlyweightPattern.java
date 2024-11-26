import java.util.Random;

public class FlyweightPattern {
    public static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static final Random random = new Random();

    public static String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }

    public static int getRandomCoordinate() {
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            var color = getRandomColor();
            Circle circle = (Circle) ShapeFactory.getCircle(color);
            circle.setX(getRandomCoordinate());
            circle.setY(getRandomCoordinate());
            circle.setRadius(10);
            circle.draw();
        }
    }
}
