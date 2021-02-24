import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Infix in = new Infix();
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(in.infixToPostfix(exp));
    }
}
