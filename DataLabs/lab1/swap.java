public class swap {

    public static <T> void swap(T[] array, int i1, int i2) {

        T temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    public static <T> void printArray(T[] array) {
        for (T element: array) {
            System.out.print(element + " ");
        }
            System.out.println();
    }
}
