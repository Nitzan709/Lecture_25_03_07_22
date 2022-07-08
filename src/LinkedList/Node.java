package LinkedList;

public class Node <E extends Comparable<? super E>> {

    private E data;
    private Node<E> next;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public Node(E data) {
        this(data, null);
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    public E getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("[%s]->", data);
    }
//todo: return here
    public void setData(E afterApplication) {
    }
}
