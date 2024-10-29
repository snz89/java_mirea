public class TestCircle {
    public static <T extends Comparable<T>> T searchMaxArrayElement(T[] array) {
        T maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static <T extends Comparable<T>> T searchMaxDArrayElement(T[][] array) {
        T maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            if (searchMaxArrayElement(array[i]).compareTo(maxElement) > 0) {
                maxElement = searchMaxArrayElement(array[i]);
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        // Одномерный массив
        Circle array[] = new Circle[4];

        array[0] = new Circle(1.0);
        array[1] = new Circle(2.0);
        array[2] = new Circle(3.0);
        array[3] = new Circle(1.5);

        Circle maxCircle = searchMaxArrayElement(array);

        System.out.println("Максимальный элемент массива: " + maxCircle);

        // Двумерный массив
        Circle array2[][] = new Circle[2][2];

        array2[0][0] = new Circle(1.0);
        array2[0][1] = new Circle(2.0);
        array2[1][0] = new Circle(7.0);
        array2[1][1] = new Circle(1.5);

        Circle maxCircle2 = searchMaxDArrayElement(array2);

        System.out.println("Максимальный элемент двумерного массива: " + maxCircle2);
    }
}
