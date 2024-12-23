public class SorterTest {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 6, 2, 7, 4};
        int[] array2 = {9, 1, 4, 5, 3, 7, 8};

        // Create objects of BubbleSort and MergeSort
        NumberSorter bubbleSort = new BubbleSort();
        NumberSorter mergeSort = new MergeSort();

        // Sort using BubbleSort
        System.out.println("Bubble Sort:");
        bubbleSort.sortNumbers(array1);
        printArray(array1);

        // Sort using MergeSort
        System.out.println("\nMerge Sort:");
        mergeSort.sortNumbers(array2);
        printArray(array2);
    }

    // Utility function to print the array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
