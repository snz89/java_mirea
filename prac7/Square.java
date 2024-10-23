package prac7;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public void howToColor(){
        System.out.println("Раскрасьте все четыре стороны");
    }

    public Square() {
        this.side = 0;
    }

    public Square(double side, String color, boolean filled) throws IllegalSquareException {
        if (side < 0)
            throw new IllegalSquareException("Недопустимые стороны: длина стороны должна быть не меньше 0");
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws IllegalSquareException {
        if (side < 0)
            throw new IllegalSquareException("Недопустимые стороны: длина стороны должна быть не меньше 0");
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Сторона: " + side + "\n" +
                "Площадь: " + getArea() + "\n" +
                "Периметр: " + getPerimeter() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Заливка: " + (isFilled() ? "да" : "нет") + "\n" +
                "Дата создания: " + getDateCreated();
    }
}