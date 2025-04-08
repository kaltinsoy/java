import java.util.Arrays;

public class ListClient {
    public static void main(String[] args) {
        // Create an instance of AList
        AList<String> list = new AList<>();

        // Test isEmpty() on a new list
        System.out.println("Is the list empty? " + list.isEmpty()); // Expected: true

        // Test add(T newEntry)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After adding 3 items: " + Arrays.toString(list.toArray())); // Expected: [Apple, Banana, Cherry]

        list.add(2, "Peach");
        System.out.println(list.getEntry(2));
        System.out.println("New List: "+ Arrays.toString(list.toArray()));
        list.remove(2);
        System.out.println("New List: "+ Arrays.toString(list.toArray()));
        System.out.println("Changed item:"+list.replace(2, "Orange"));
        System.out.println("New List: "+ Arrays.toString(list.toArray()));
        System.out.println(list.contains("Apple"));
    }
}