public class StackList<E> extends  AbstractStack<E>{

    static int capacity = 1000;
    private int stackTop;
    protected E data[];

    public StackList()
    //post: constructor de un stack nuevo
    {
        data = (E[])new Object[capacity];
        stackTop = 0;
    }
    /**
     * Agrega un item al stack y sera eliminado en un pop si no se agrega otro item
     *
     */
    @Override
    public void push(E item) {
        if(stackTop+1 == data.length){
            System.out.println("Stack esta lleno no puedes meter mas datos");
        }
        else{
            data[++stackTop] = item;
        }

    }

    /**
     * pre: El stack no puede estar vacio
     * post: elimina el ultimo item y lo devuelove
     */
    @Override
    public E pop() {
        E poped = data[stackTop];
        data[stackTop] = null; //Just make it 0(1)
        stackTop--;
        return poped;
    }

    /**
     * pre: El stack no puede estar vacio
     * post: muestra el valor proximo a ser eliminado
     */
    @Override
    public E peek() {
        return data[stackTop];
    }

    /**
     * Devuelve el tamaño del stack
     */
    @Override
    public int size() {
        return stackTop;
    }
    public boolean isFull() {
        return stackTop + 1 == data.length;
    }
}
