/**
 * @author Juan Angel Carrera
 *  @author Jessica Pamela Ortiz
 *  @version 24/02/2021
 *  @since 23/02/2021
 *  @param <E> parametro para que el dato sea generico
 *
 *  Implementacion de un stack por medio de una lista simplemente ecadenada
 */
public class StackList<E> extends  AbstractStack<E>{

    Node top;
    int size;

    /**
     * @post: constructor de un nuevo stack
     */
    public StackList()
    {
        this.top = null;
        size =0 ;
    }
    /**
     * @post: agrega un item al final del stack
     * @param item item que sera agregado
     */
    @Override
    public void push(E item) {

        // initialize data into temp data field
        // put top reference into temp link
        Node temp = new Node(item,top);

        // update top reference
        top = temp;
        this.size++;
    }

    /**
     * @pre: Stack no puede estar vacio
     * @post: elimina el ultimo item
     * @return el utlimo item que es eliminado
     */
    @Override
    public E pop() {
        if (top == null) {
            System.out.print("\nStack esta vacio");
        }

        // update the top pointer to point to the next node
        E temp = (E) top.data;
        top = (top).next;
        size--;
        return temp;
    }

    /**
     * @pre: El stacn no puede estar vacio
     * @post: muestra el valor porximo a ser eliminado
     * @return regresa el valor mas recientemente agregado
     */
    @Override
    public E peek() {
        E temp = null;
        // check for empty stack
        if (empty()) {
            System.out.println("Stack esta vacio");
        }
        else {
            temp= (E) top.data;
        }
        return temp;
    }

    /**
     * @return el tamaño del stack
     */
    @Override
    public int size() {
        return this.size;
    }

}
