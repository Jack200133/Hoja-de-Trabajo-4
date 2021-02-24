public class StackDoubleList<E> extends AbstractStack<E>  {

    Node head = null;
    Node tail = null;
    int size = 0;

    public StackDoubleList() {
    }

    public void push(E item) {
        this.tail = this.head;
        this.head = new Node(item, null,null);
        this.head.data = item;
        this.head.next = this.tail;
        this.head.prev = null;
        if (this.tail != null) {
            this.tail.prev = this.head;
        }


        ++this.size;
    }

    public E pop() {
        E temp = null;
        if (this.empty()) {
            System.out.println("İs Empty");
        } else {
            --this.size;
            temp = (E) this.head.data;
            this.head = this.head.next;
        }

        return temp;
    }

    public E peek() {
        E temp = null;
        if (this.empty()) {
            System.out.println("İs Empty");
        } else {
            temp = (E) this.head.data;
        }

        return temp;
    }

    public int size() {
        return this.size;
    }
}
