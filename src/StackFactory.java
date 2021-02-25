public class StackFactory<E> {
    //selecciona la implementacion para un tsack
    //se utiliza el patron factory

    public Stack<E> getStack(String entry) {
        return switch (entry) {
//regresa un List
            case "SL" -> new StackList();
//regresa una Lista doble
            case "SLD" -> new StackDoubleList<>();
//regresa un ArrayList
            case "SAL" -> new StackArrayList<E>();
//regresa Vector
            default -> new StackVector<E>();
        };
    }
}

