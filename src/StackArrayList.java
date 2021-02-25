/**
 * @author Juan Angel Carrera
 *  @author Jessica Pamela Ortiz
 *  @version 24/02/2021
 *  @since 23/02/2021
 *  @param <E> parametro para que el dato sea generico
 *
 *  Implementacion de un stack por medio de un ArrayList
 */

import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E>{

    protected ArrayList<E> data;

    /**
     * @post: constructor de un nuevo stack
     */
    public StackArrayList()
    {
        data = new ArrayList<E>();
    }

    /**
     * @post: agrega un item al final del stack
     * @param item item que sera agregado
     */
    @Override
    public void push(E item) {
        data.add(item);
    }

    /**
     * @pre: Stack no puede estar vacio
     * @post: elimina el ultimo item
     * @return el utlimo item que es eliminado
     */
    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    /**
     * @pre: El stacn no puede estar vacio
     * @post: muestra el valor porximo a ser eliminado
     * @return regresa el valor mas recientemente agregado
     */
    @Override
    public E peek() {
        return data.get(size()-1);
    }

    /**
     * @return el tamaño del stack
     */
    @Override
    public int size() {
        return data.size();
    }
}
