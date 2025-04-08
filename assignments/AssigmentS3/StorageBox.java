public class StorageBox<T> {

    private T[] items;
    private int size;
    private int capacity;

public StorageBox(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.items = (T[]) new Object[capacity];
}

public void addItem(T item) {
    if(capacity == size) {
        System.out.println("StorageBox is full");
        return;
    } else {
        items[size] = item;
        size++;
        System.out.println("Item added: "+ item);
    }
}

public T removeItem() {
        if(size == 0) {
            System.out.println("No more item left!");
            return null;
        } else {
            T temp = items[size - 1];
            items[size - 1] = null;
            size--;
            System.out.println("Removed Item: "+ temp);
            return temp;
        }
}

public void listItem() {
        System.out.println("Items in StorageBox: ");
        for(int i = 0; i < size; i++) {
            System.out.print(items[i]+ " ");
        }
}

}
