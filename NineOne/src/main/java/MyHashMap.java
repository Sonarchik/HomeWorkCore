import java.util.Objects;

public class MyHashMap<K, V> {
    private Node<K, V>[] table;
    private int size = 0;
    private static final float RESIZE_THRESHOLD = 1.0f;
    private static final int DEFAULT_CAPACITY = 16;
    private int countLength = 0;

    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];

    }


    public void put(K k, V v) {
        int hash = k.hashCode();
        int index = hash % table.length;


        if (table[index] == null) {
            table[index] = new Node<>(hash, k, v, null);
            size++;
        } else {
            if (table[index].key.equals(k)) {
                table[index].value = v;
            } else {
                table[index].next = new Node<>(hash, k, v, null);
                size++;
            }

        }

        if (size > table.length * RESIZE_THRESHOLD) {
            resize();

        }

    }

    private void resize() {
        Node<K, V>[] oldTable = table;
        table = new Node[table.length * 2];
        size = 0;
        for (Node<K, V> node : oldTable) {
            if (node != null) {
                put(node.key, node.value);
                while (node.next != null) {
                    put(node.next.key, node.next.value);
                    node = node.next;
                }
            }

        }

    }

    public void remove(K k) {

        int hash = k.hashCode();
        int index = hash % table.length;
        if (table[index] != null && table[index].key.equals(k)) {
            table[index] = table[index].next;
            size--;
        } else if (table[index].next != null && table[index].next.key.equals(k)) {
            table[index].next = table[index].next.next;
            size--;
        }else if (table[index].next.next != null && table[index].next.next.key.equals(k)) {
            table[index].next.next = table[index].next.next.next;
            size--;
        }

    }

    public int size() {
        return size;
    }

    public void clear() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public String get(K k) {
        String result = "";
        for (Node<K, V> node : table) {
            if (node != null && node.key.equals(k)) {
                result = " Key = " + node.key + " Value = " + node.value;

                while (node.next != null && node.next.key.equals(k)) {
                    result = " Key = " + node.next.key + " Value = " + node.next.value;
                    node = node.next;
                }
            }

        }
        return result;
    }

    @Override
    public String toString() {
        String result = "MyHashMap{ ";
        for (Node<K, V> node : table) {
            if (node != null) {
                countLength++;
                result += node.key + " = " + node.value + ", ";

                while (node.next != null) {
                    result += node.next.key + " = " + node.next.value + ", ";
                    node = node.next;
                }
            }

        }
//
        return result + " size=" + size + " table.lenght " + table.length + "}";
    }

    private static class Node<K, V> {
        private final int hash;
        private final K key;
        private V value;
        private Node<K, V> next;

        public int getHash() {
            return hash;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }

        private Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return getHash() == node.getHash() &&
                    getKey().equals(node.getKey()) &&
                    getValue().equals(node.getValue()) &&
                    Objects.equals(getNext(), node.getNext());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getKey(), getValue());
        }
    }
}
