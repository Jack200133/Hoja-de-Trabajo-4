/**
 * @author Juan Angel Carrera
 * @author Jessica Pamela Ortiz
 * @version 24/02/2021
 * @since 23/02/2021
 *
 * Implementacion de una calculadora usando postfix
 * */
public class CalculadoraJessJac implements CalculadoraGeneral {

    private Stack<Integer> vec;

    /**
     * @post:  inicialista la clase calculadora
     * @param StackTipe parametro que le da el tipo de stack
     * */
    public CalculadoraJessJac(String StackTipe) {
        vec = Singleton.getStack(StackTipe);
    }

    /**
     * @post: crea un resultado de la operacion que es enviada
     * @param texto es la operacion que sera operada
     * @return regresa el resultado de la operacion o si la operacion es invalida
     */
    @Override
    public String Calculo(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char inds = texto.charAt(i);

            if(Character.isWhitespace(inds)){ //no espacios en blanco

            }

            else if(Character.isDigit(inds)){
                vec.push(Character.getNumericValue(inds));
            }
            else {
                if (vec.size() > 1) {
                    try{
                        int n1 = vec.pop();
                        int n2 = vec.pop();

                        switch (inds) {
                            case '+' -> {
                                vec.push(n1 + n2);
                            }
                            case '-' -> {
                                vec.push(n2 - n1);
                            }
                            case '*' -> {
                                vec.push(n1 * n2);
                            }
                            case '/' -> {
                                vec.push(n2 / n1);
                            }
                        }
                    } catch (ArithmeticException e){
                        if(vec.size() > 1){
                            for (int j = 0; j <= vec.size(); j++) {
                                vec.pop();
                            }
                        }

                        return "No divisible entre 0";
                    }
                }
                else {
                    for (int j = 0; j <= vec.size(); j++) {
                        vec.pop();
                    }
                    return "Operacion No Valida";
                }
            }

        }
        if(vec.size() == 1){
            return vec.pop().toString();
        }
        else if (vec.size() > 0){
            for (int j = 0; j <= vec.size(); j++) {
                vec.pop();
            }
            return "Operacion No Valida";
        }
        return "Operacion no valida";
    }
}
