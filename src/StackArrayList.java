import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E>{

    protected ArrayList<E> data;

    public StackArrayList()
    //post: constructor de un stack nuevo
    {
        data = new ArrayList<E>();
    }

    /** Agrega un item al stack y sera eliminado en un pop si no se agrega otro item
     * @param item*/
    @Override
    public void push(E item) {
        data.add(item);
    }

    /**
     * pre: El stack no puede estar vacio
     * post: elimina el ultimo item y lo devuelove
     */
    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    /** pre: El stack no puede estar vacio
     * post: muestra el valor proximo a ser eliminado*/
    @Override
    public E peek() {
        return data.get(size()-1);
    }

    /**
     * Devuelve el tamaño del stack
     */
    @Override
    public int size() {
        return data.size();
    }
}
