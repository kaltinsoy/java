public class ArrayBag<T> implements BagInterface<T> {

    private T[] t;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 25;


    public ArrayBag(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.t = (T[]) new Object[capacity];

    }
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public int getCurrentSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T newEntry) {
        if (isFull()) {
 //       return false;
            resize();
        }
        t[size] = newEntry;
        size++;
        return true;
    }

    public T remove() {
        if (isEmpty()) {
            return null;
        }
            T temp = t[size - 1];
            t[size - 1] = null;
            size--;
            return temp;
        }

    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        if (index >= 0) {
            t[index] = t[size - 1];
            t[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

    public void clear() {
        while(!isEmpty()) {
            t[size - 1] = null;
            size--;
        }
    }

    public int getFrequencyOf(T anEntry) {
    int temp = 0;
    for(int i = 0; i < size; i++) {
        if(t[i] == anEntry) {
            temp++;
        }
    }
    return temp;
    }

    public boolean contains(T anEntry) {
        if(getFrequencyOf(anEntry) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public T[] toArray() {
        T[] newArray = (T[]) new Object[size];
        for(int i = 0; i < size; i++) {
        newArray[i] = t[i];
        }
    return newArray;
    }

    private int getIndexOf(T anEntry) {
        for(int i = 0; i < size; i++) {
            if(t[i] == anEntry) {
            return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return capacity == size;
 }
    public void resize() {
        int newCapacity = 2 * capacity;
        T[] newArray = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = t[i];
    }

    t = newArray;
    capacity = newCapacity;{}
    }

        public ArrayBag<T> union(ArrayBag<T> otherBag) {
            ArrayBag<T> result = new ArrayBag<>(this.size + otherBag.size);

            for(int i = 0; i < this.size; i++){
                result.add(this.t[i]);
            }

            for(int i = 0; i < otherBag.size; i++){
                result.add(otherBag.t[i]);
            }
            return result;
        }

        public ArrayBag<T> intersection(ArrayBag<T> otherBag) {
            ArrayBag<T> result = new ArrayBag<>(Math.min(this.size, otherBag.size));

            for(int i = 0; i < this.size; i++) {
                T temp = this.t[i];


                if(otherBag.contains(temp)) {
                    result.add(temp);
                    otherBag.remove(temp);
                }
            }
            return result;
        }

}
