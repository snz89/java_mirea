package prac7;

public class Circle extends GeometricObject {
    private double radius;

    public void howToColor(){
        System.out.println("Раскрасьте все четыре стороны");
    }

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\nРадиус: " + getRadius() + "\nПериметр: " + getPerimeter() + ", площадь: " + getArea();
    }
}