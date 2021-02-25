/**
 * @author Juan Angel Carrera
 *  @author Jessica Pamela Ortiz
 *  @version 24/02/2021
 *  @since 23/02/2021
 *  @param <E> parametro para que el dato sea generico
 *
 *  selecciona la implementacion para un stack
 *            se utiliza el patron factory
 */
public class StackFactory<E> {

    /**
     * @post: regresa el stack seleccionado
     * @param entry es el tipo de stack que se inicializa
     * @return el stack seleccionado nuevo
     */
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

