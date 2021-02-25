/**
 * @author Juan Angel Carrera
 * @author Jessica Pamela Ortiz
 * @version 24/02/2021
 * @version 23/02/2021
 *
 * @param <E> generics para que acepte cualquier tipo de dato
 *
 * Clase de singlenton para almacenar el stack que se utilizara
 */
public final class Singleton<E> {

    private static Stack datos; //se guarda el stack

    /**
     * @post: Se crea la instancia de Stack
     * @param entry es el parametro para saber que tipo de stack se fabricara
     */
    private Singleton(String entry){
        StackFactory StFc = new StackFactory();
        datos = StFc.getStack(entry); //Aqui se pone que tipo de Stack se Quiere
    }

    /**
     * @post: llama a la intsancia del Stack
     * @param entry es el paramatro para el tipo de stack
     * @return regresa la intancia del stack
     */
    public static Stack getStack(String entry){
        if(datos==null){
            new Singleton(entry);
        }

        return datos;
    }
}
