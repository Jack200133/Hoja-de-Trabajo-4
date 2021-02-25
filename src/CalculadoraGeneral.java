
/***************************************************************
 * CalculadoraGeneral.java
 * @author Juan Angel Carrera
 * @author Jessica Pamela Ortiz
 * @version 24/02/2021
 * @since 23/02/2021
 *
 * Interfaz que tiene un solo metodo donde recibira un string
 * donde hara los calculos y por medio de el satckvector
 * hara las operaciones
 *************************************************************/
public interface CalculadoraGeneral {

        /** @pre: el dato que recibe para calcular debe ser postfix
         * @param texto es el string que se va a calcular
         * @post:  el dato resulto por medio de postfix y utilizando stack*/
        String Calculo (String texto);


}
