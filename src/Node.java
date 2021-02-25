/**
 * @author Juan Angel Carrera
 * @version 24/02/2021
 * @since 24/02/2021
 * @param <E> generics para que acepte cualquier tipo de dato
 *
 *  Clase de nodo paora implementar en la listas
 */
public class Node<E> {
    E data;
    Node next;
    Node prev;

    /**
     * @post: Crea un nodo doblemente encadenado
     * @param data dato que almacena el nodo
     * @param next siguiente dato en la lista
     * @param prev dato anterior en la lista
     */
    public Node(E data, Node next, Node prev) {
        this.next = next;
        this.data = data;
        this.prev = prev;
    }

    /**
     * @post: Crea un nodo simplemente encadenado
     * @param data dato que almacena el nodo
     * @param next dato del siguiente en la lista
     */
    public Node(E data,Node next){
        this.data = data;
        this.next = next;
        this.prev = null;
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
