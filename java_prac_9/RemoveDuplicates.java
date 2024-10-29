import java.util.ArrayList;

public class RemoveDuplicates {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> array) {
        ArrayList<T> result = new ArrayList<>();
        for (T element : array) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        System.out.println(removeDuplicates(arr));
    }
}
