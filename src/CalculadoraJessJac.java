public class CalculadoraJessJac implements CalculadoraGeneral {
    Stack<Integer> vec;


    public CalculadoraJessJac(String StackTipe) {
        Singleton sg = new Singleton();
        vec = sg.getStack(StackTipe);
    }

    /**
     * Metodo donde la calculadora llamara al stack para almacenar y hacer los calculos
     *
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
