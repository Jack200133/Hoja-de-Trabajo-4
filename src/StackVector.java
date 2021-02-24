import java.util.*;

public class StackVector<E> extends AbstractStack<E>{
    Vector<E> vector;

    public StackVector()
    {
        //post: construye un vector con capacidad de 10 elementos
        this.vector = new Vector<E>();
    }

    public void push(E item)
    {
        //pre: 0<= index <= size()
        //post: inserta el nuevo valor en el vector con el indice deseado (moviendo los elementos de index a size()-1 a la derecha)
        vector.add(item);
    }

    public boolean empty()
    {
        return size()==0;
        //post: regresa verdadero si no hay elementos en el vector
    }

    public E pop() {
        return vector.remove(size()-1);
    }


    public E peek() {
        return vector.get(size()-1);
    }

    public int size()
    {
        //post: regresa el tamaño del vector
        return vector.size();
    }
}
