import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String post;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese que tipo de Stack se implementara:");
        System.out.println("1. List Simple encadenada");
        System.out.println("2. List Doblemente encadenada");
        System.out.println("3. ArrayLis ");
        System.out.println("4. Vector ");
        int op = scan.nextInt();
        String res;

        if(op ==1){
            res = "SL";
        }else if(op ==2){
            res = "SLD";
        }else if(op ==3){
            res = "SAL";
        }else{
            res = "";
        }


        Infix in = new Infix(Singleton.getStack(res));


        System.out.println("----------------------------------------");
        scan.nextLine();
        System.out.println("Ingrese la operacion que dese efectuar:");

        String pr = scan.nextLine();

        if (!pr.equals("")){
            System.out.println("El dato ingresado es: " +pr);
            post = in.infixToPostfix(pr);

            System.out.println("La respuesta es: "+ SingletonCalcu.getCalcu(Singleton.getStack(res)).Calculo(post));
        }else {
            System.out.println("No se ingreso Ningun dato");
        }



    }
}
