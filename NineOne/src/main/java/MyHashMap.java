import java.util.Objects;
public class MyHashMap<K, V> {
    private Node<K, V>[] table;
    private int size = 0;
    private static final float RESIZE_THRESHOLD = 1.0f;
    private static final int DEFAULT_CAPACITY = 16;

    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];

    }


    public void put(K k, V v) {
        int index = calculateIndex(k,table.length);

        if (table[index] == null) {
            table[index] = new Node<>(k, v, null);
            size++;
        } else {
            if (table[index].key.equals(k)) {
                table[index].value = v;
            } else {
                table[index].next = new Node<>(k, v, null);
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
    public static int calculateIndex(Object key, int tableCapacity){
        int hash = key.hashCode();
        return hash & tableCapacity-1;
    }

    public V remove(K k) {

        int index = calculateIndex(k,table.length);
            var current = table[index];
        if (current != null && current.key.equals(k)) {
            var value = current.value;
            table[index] = current.next;
            size--;
            return value;
        }
        while (current.next != null) {
            if (current.next.key.equals(k)) {
                var value = current.next.value;
                current.next = current.next.next;
                size--;
                return value;
            }
            current = current.next;
        }
        return null;
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
        private final K key;
        private V value;
        private Node<K, V> next;

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        private Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return  getKey().equals(node.getKey()) &&
                    getValue().equals(node.getValue()) &&
                    Objects.equals(getNext(), node.getNext());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getKey(), getValue());
        }
    }
}
