public class StackFactory<E> {
    //selecciona la implementacion para un tsack
    //se utiliza el patron factory

    public Stack<E> getStack(String entry){
        if(entry.equals("SL")){
            return new StackList(); //regresa un List
        }else  if(entry.equals("SAL")){
            return new StackArrayList<E>();//regresa un ArrayList
        }else {
            return new StackVector<E>(); //regresa Vector
        }
    }
}
