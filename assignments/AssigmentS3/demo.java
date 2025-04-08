public class demo {
    public static void main(String[] args) {
    StorageBox<String> box = new StorageBox<>(3);
    StorageBox<Integer> box1 = new StorageBox<>(3);

    box.addItem("Math");
    box.addItem("Java");
    box.addItem("Statistics");
    box.addItem("capacityTest");

    System.out.println();

    box.listItem();

    System.out.println(" ");
    System.out.println();

    box.removeItem();
    box.removeItem();
    box.removeItem();
    box.removeItem();
    box.removeItem();
    box.removeItem();

    System.out.println();;

    box.listItem();

    box1.addItem(1);
    box1.addItem(2);
    box1.addItem(3);
    box1.addItem(4);

    box1.listItem();
    }
}
