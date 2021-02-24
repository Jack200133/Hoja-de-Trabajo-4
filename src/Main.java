import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Infix in = new Infix("SLD");
        String exp = "(3+5)*2";
        String post = in.infixToPostfix(exp);
        System.out.println(post);


        CalculadoraJessJac cal = new CalculadoraJessJac("SLD");
        System.out.println(cal.Calculo(post));


    }
}
