/**
 * @author Juan Angel Carrera
 * @author Jessica Pamela Ortiz
 * @version 23/02/2021
 * @since 23/02/2021
 *
 * Clase abstracta que implementa el metodo de empy para que sea constante entre todos los stack*/
public abstract class AbstractStack<E> implements Stack<E>{

    /** @pre: impementa la interfaz de stack
     * @post: usa el metodo empity para mostrar si los stack estan vacios o no
     */
    public boolean empty() {
        return size()==0;
    }
}
