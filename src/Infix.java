/**
 * @author Juan Angel Carrera
 * @author Jessica Pamela Ortiz
 * @version 24/02/2021
 * @since 23/02/2021
 *
 * Implementacion de un traductor de infix a postfix
 */

public class Infix {
    Stack StackTipe;

    /**
     * @param StackTipe es el tipo de stack que usara el infix
     */
    public Infix(String StackTipe) {
        this.StackTipe = Singleton.getStack(StackTipe);
    }

    public int jerarquia(char ch)
    {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public String infixToPostfix(String exp)
    {
        StringBuilder result = new StringBuilder();

        // stack vacio
        Stack<Character> stack = StackTipe;

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            //si el caracter leido es un operando agregarlo a la salida
            if (Character.isLetterOrDigit(c))
                result.append(c);

            //si el caracter leido es un '(', hacer un push
            else if (c == '(')
                stack.push(c);

            //si el caracter leido es un '(', hacer un pop hasta encontrar el ')'
            else if (c == ')')
            {
                while (!stack.empty() &&
                        stack.peek() != '(')
                    result.append(stack.pop());

                stack.pop();
            }
            else //si un operador es encontrado
            {
                while (!stack.empty() && jerarquia(c)
                        <= jerarquia(stack.peek())){

                    result.append(stack.pop());
                }
                stack.push(c);
            }

        }

        // hacer pop a todas las operaciones encontradas
        while (!stack.empty()){
            if(stack.peek() == '(')
                return "Expresión Invalida";
            result.append(stack.pop());
        }
        return result.toString();
    }
}
