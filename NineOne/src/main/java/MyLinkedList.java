import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        firstNode = new Node<E>(null, null, lastNode);
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    public void add(E e) {
        Node<E> prev = lastNode;
        prev.setItem(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNext(lastNode);
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index<0 || index >=size()");
        }
        Node<E> ref = firstNode;
        for (int i = 0; i <= index; i++) {
            ref = ref.next;
        }
        if (index == 0) {
            firstNode = ref;
        } else {
            ref.prev.next = ref.next;
            ref.next.prev = ref.prev;
        }
        size--;
        return ref.item;
    }

    public E get(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("index<0 || index > size()");
        }
        Node<E> target = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            target = target.getNext();
        }
        return target.getItem();
    }

    public int size() {
        return size;
    }

    public void clear() {
        firstNode = new Node<E>(null, null, lastNode);
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return get(counter++);
            }
        };
    }


    private class Node<E> {
        private E item;
        private Node<E> next;

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        private Node<E> prev;

        private Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
