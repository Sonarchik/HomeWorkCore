import java.util.Arrays;

public class MyArrayList<T> {
    private T[] list;
    private int size, index;
    private T item;

    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity <= 0");
        } else {
            list = (T[]) new Object[capacity];
        }
    }

    public void display() {
        for (T t : list) {
            System.out.print(t + " ");
        }
        System.out.println("");
    }

    public void add(T item) {
        if (list.length == size) {
            list = Arrays.copyOf(list, list.length * 2);

        }
        list[size++] = item;
    }

    public void add(int index, T item) {
        if (index < 0) {
            throw new IllegalArgumentException("index < 0");
        } else if (index > list.length) {
            throw new IllegalArgumentException("index > length");
        } else {

            if (list.length == size) {
                list = Arrays.copyOf(list, list.length * 2);

            }
            for (int i = size; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = item;
            size++;
        }
    }

    public void remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index < 0");
        } else if (index > list.length) {
            throw new IllegalArgumentException("index > length");
        }else {
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            list[size] = null;
            size--;
            if (list.length > 2 * size) {
                list = Arrays.copyOf(list, list.length / 2);
            }

        }
    }

    public void clear() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index < 0");
        } else if (index > list.length) {
            throw new IllegalArgumentException("index > length");
        } else {
            return list[index];
        }
    }

}
