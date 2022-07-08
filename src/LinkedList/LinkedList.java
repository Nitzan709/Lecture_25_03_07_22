package LinkedList;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LinkedList<E extends Comparable<? super E>> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public void append(E value) {
        Node<E> node = new Node<>(value);

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }

        ++size;
    }

    public void appendAll(Collection<? extends E> collection) {
        for (E value : collection) {
            append(value);
        }
    }

    public void copyAll(Collection<? super E> collection) {
        Node<E> curr = head;
        while (curr != null) {
            collection.add(curr.getData());
            curr = curr.getNext();
        }
    }

    public boolean remove(E value) {
        Node<E> curr = head;
        Node<E> prev = curr;

        while (curr != null) {

            if (curr.getData().compareTo(value) == 0) {
                unlink(prev, curr);
                --size;
                return true;
            }

            prev = curr;
            curr = curr.getNext();
        }

        return false;
    }

    private void unlink(Node<E> prev, Node<E> curr) {
        if (curr == head) {
            Node<E> next = head.getNext();
            head.setNext(null);
            head = next;
        } else if (curr == tail) {
            tail = prev;
            tail.setNext(null);
        } else {
            prev.setNext(curr.getNext());
            curr.setNext(null);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> curr = head;

        while (curr != null) {
            sb.append(curr);

            curr = curr.getNext();
        }

        sb.append("null");

        return sb.toString();
    }

    public void forEach(Consumer<? super E> action) {
        Node<E> curr = head;

        while (curr != null) {
            action.accept(curr.getData());
            curr = curr.getNext();
        }
    }

    public void replaceAll(UnaryOperator<E> operator) {
        Node<E> curr = head;

        while (curr != null) {
            curr.setData(operator.apply(curr.getData()));
            curr = curr.getNext();
        }
    }

    // TODO: 7/6/2022 what is the problem (next)
    // TODO: 7/6/2022 ? super E OR ? extends E -> consumer E or supplair  
    public void removeIf(Predicate<E> filter) {
        Node<E> curr = head;

        while (curr != null) {
            if (filter.test(curr.getData())) {
                remove(curr.getData());
            }
            curr = curr.getNext();
        }
    }
}
