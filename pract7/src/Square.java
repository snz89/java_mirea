public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this.side = 0;
    }

    public Square(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public void howToColor() {
        System.out.println("Раскрастье все четыре стороны");
    }

    @Override
    public String toString() {
        return "Квадрат со стороной = " + this.side;
    }
}
