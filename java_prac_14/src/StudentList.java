public class StudentList <T>{
    private final T[] students;

    @SuppressWarnings (value="unchecked")
    public StudentList(int size) {
        students = (T[]) new Object[size];
    }

    public StudentList(T[] list) {
        students = list;
    }

    public void setStudent(int index, T student) throws IndexOutOfBoundsException {
        if (index < 0 || index >= students.length) {
            throw new IndexOutOfBoundsException(
                    String.format(
                            "Index %d out of bounds for length %d",
                            index,
                            students.length
                    )
            );
        }
        students[index] = student;
    }

    public Iterator<T> getIterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < students.length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements");
            }
            return students[index++];
        }
    }
}
