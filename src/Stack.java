/**
 * @author Juan Angel Carrera
 * @author Jessica Pamela Ortiz
 * @version 24/02/2021
 * @since 23/02/2021
 * @param <E> parametro para que el dato sea generico
 *
 * Interfaz que define el contrato de los stack
 */
public interface Stack<E> {

    /**
     * @post: agrega un item al final del stack
     * @param item item que sera agregado
     */
    public void push(E item);

    /**
     * @pre: Stack no puede estar vacio
     * @post: elimina el ultimo item
     * @return el utlimo item que es eliminado
     */
    public E pop();


    /**
     * @pre: El stacn no puede estar vacio
     * @post: muestra el valor porximo a ser eliminado
     * @return regresa el valor mas recientemente agregado
     */
    public E peek();

    /**
     *
     * @return si el stack esta vacio o no
     */
    public boolean empty();


    /**
     * @return el tamaño del stack
     */
    public int size();
}
