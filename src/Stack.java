public interface Stack<E> {

    /** Agrega un item al stack y sera eliminado en un pop si no se agrega otro item*/
    public void push(E item);

     /** pre: El stack no puede estar vacio
     * post: elimina el ultimo item y lo devuelove*/
    public E pop();

    /** pre: El stack no puede estar vacio
     * post: muestra el valor proximo a ser eliminado*/
    public E peek();

    /** Devuelve si el stack esta vacio o no*/
    public boolean empty();

    /** Devuelve el tamaño del stack*/
    public int size();
}
