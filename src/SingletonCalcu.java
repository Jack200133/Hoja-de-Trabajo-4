/**
 * @author Juan Angel Carrera
 * @param <E> generics para que acepte cualquier tipo de dato
 * @version 24/02/2021
 * @since 24/02/2021
 *
 * Clase de singlenton para almacenar la calculadora que se utilizara
 */
public final class SingletonCalcu<E> {

    private static CalculadoraGeneral calcu; //se guarda la calculadora

    /**
     * @post: se crea la instancia de la calculadora
     * @param fe es el paramatro para el tipo de stack
     */
    private SingletonCalcu(String fe){
        calcu = new CalculadoraJessJac(fe); //Aqui se pone que tipo de Stack se Quiere
    }

    /**
     * @post: llama a la intsancia de la calculadora
     * @param entry es el paramatro para el tipo de stack
     * @return regresa la instancia de la calculadora
     */
    public static CalculadoraGeneral getCalcu(String entry){
        if(calcu==null){
            new SingletonCalcu(entry);
        }

        return calcu;
    }
}
