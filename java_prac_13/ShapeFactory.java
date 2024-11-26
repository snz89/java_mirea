import java.util.Map;
import java.util.HashMap;

public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapeMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println(">>> Creating circle of color : " + color);
        }

        return circle;
    }
}
