abstract public class GeometricObject implements Comparable {
    private String color = "белый";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Создает по умолчанию заданный геометрический объект */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Создает геометрический объект с указанным цветом и заливкой */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Возвращает цвет */
    public String getColor() {
        return color;
    }

    /** Присваивает новый цвет */
    public void setColor(String color) {
        this.color = color;
    }

    /** Возвращает заливку. Поскольку filled типа boolean,
     *  getter-метод называется isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Присваивает новую заливку */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Получает dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Возвращает строковое представление этого объекта */
    @Override
    public String toString() {
        return "создан " + dateCreated + ",\nцвет: " + color +
                ", заливка: " + filled;
    }

    // Абстрактные методы
    public abstract double getArea();
    public abstract double getPerimeter();

    // Поиск максимального объекта, если объекты равны, возвращает левый объект
    public static GeometricObject max(GeometricObject left, GeometricObject right) {
        return (left.compareTo(right) >= 0 ? left : right);
    }

    // Метод для сравнения объектов
    public double compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}