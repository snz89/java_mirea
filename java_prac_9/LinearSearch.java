public class LinearSearch {
    public static <T> int linearSearch(T[] array, T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Массив целых чисел");
        Integer intArray[] = {1, 2, 3, 4, 5};
        System.out.println(linearSearch(intArray, 2));
        System.out.println(linearSearch(intArray, 6));

        System.out.println("Массив строк");
        String stringArray[] = {"aa", "bb", "cc", "ac", "ab"};
        System.out.println(linearSearch(stringArray, "ab"));
        System.out.println(linearSearch(stringArray, "hj"));

        System.out.println("Массив дробных чисел");
        Double doubleArray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(linearSearch(doubleArray, 2.2));
        System.out.println(linearSearch(doubleArray, 6.6));
    }
}
