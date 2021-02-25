/**
 * @author Juan Angel Carrera
 *  @author Jessica Pamela Ortiz
 *  @version 24/02/2021
 *  @since 23/02/2021
 *  @param <E> parametro para que el dato sea generico
 *
 *  Implementacion de un stack por medio de un vector
 */
import java.util.*;

public class StackVector<E> extends AbstractStack<E>{
    Vector<E> vector;

    /**
     * @post: constructor de un nuevo stack
     */
    public StackVector()
    {
        this.vector = new Vector<E>();
    }

    /**
     * @post: agrega un item al final del stack
     * @param item item que sera agregado
     */
    public void push(E item)
    {
        //pre: 0<= index <= size()
        //post: inserta el nuevo valor en el vector con el indice deseado (moviendo los elementos de index a size()-1 a la derecha)
        vector.add(item);
    }


    /**
     * @pre: Stack no puede estar vacio
     * @post: elimina el ultimo item
     * @return el utlimo item que es eliminado
     */
    public E pop() {
        return vector.remove(size()-1);
    }

    /**
     * @pre: El stack no puede estar vacio
     * @post: muestra el valor porximo a ser eliminado
     * @return regresa el valor mas recientemente agregado
     */
    public E peek() {
        return vector.get(size()-1);
    }

    /**
     * @return el tamaño del stack
     */
    public int size()
    {
        return vector.size();
    }
}
