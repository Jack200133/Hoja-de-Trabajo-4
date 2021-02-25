/**
 * @author Juan Angel Carrera
 *  @author Jessica Pamela Ortiz
 *  @version 24/02/2021
 *  @since 23/02/2021
 *  @param <E> parametro para que el dato sea generico
 *
 *  Implementacion de un stack por medio de una lista doblemente encadenada
 */
public class StackDoubleList<E> extends AbstractStack<E>  {

    Node head = null;
    Node tail = null;
    int size = 0;

    /**
     * @post: constructor de un nuevo stack
     */
    public StackDoubleList() {
    }

    /**
     * @post: agrega un item al final del stack
     * @param item item que sera agregado
     */
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

    /**
     * @pre: Stack no puede estar vacio
     * @post: elimina el ultimo item
     * @return el utlimo item que es eliminado
     */
    public E pop() {
        E temp = null;
        if (this.empty()) {
            System.out.println("Stack esta vacio");
        } else {
            --this.size;
            temp = (E) this.head.data;
            this.head = this.head.next;
        }

        return temp;
    }

    /**
     * @pre: El stacn no puede estar vacio
     * @post: muestra el valor porximo a ser eliminado
     * @return regresa el valor mas recientemente agregado
     */
    public E peek() {
        E temp = null;
        if (this.empty()) {
            System.out.println("Stack esta vacio");
        } else {
            temp = (E) this.head.data;
        }

        return temp;
    }
    /**
     * @return el tamaño del stack
     */
    public int size() {
        return this.size;
    }
}
