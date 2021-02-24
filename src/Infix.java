public class Infix {
    String StackTipe;

    public Infix(String StackTipe) {
        this.StackTipe = StackTipe;
    }

    public int jerarquia(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostfix(String exp)
    {
        StringBuilder result = new StringBuilder();
        Singleton sg = new Singleton();
        // stack vacio
        Stack<Character> stack = sg.getStack(StackTipe);

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
