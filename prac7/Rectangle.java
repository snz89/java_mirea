package prac7;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public void howToColor(){
        System.out.println("Раскрасьте все четыре стороны");
    }

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + "\nВысота: " + getHeight() + ", ширина: " + getWidth() + "\nПлощадь: " + getArea() + ", периметр: " + getPerimeter();
    }
}