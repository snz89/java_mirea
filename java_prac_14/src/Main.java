public class Main {
    public static void main(String[] args) {
        StudentList<String> list = new StudentList<>(5);

        list.setStudent(0, "Student 1");
        list.setStudent(1, "Student 2");
        list.setStudent(2, "Student 3");
        list.setStudent(3, "Student 4");
        list.setStudent(4, "Student 5");

        var listIter = list.getIterator();

        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }
    }
}