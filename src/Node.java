public class Node<E> {
    E data;
    Node next;
    Node prev;

    public Node(E data, Node next, Node prev) {
        this.next = next;
        this.data = data;
        this.prev = prev;
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
