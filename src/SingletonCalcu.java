public final class SingletonCalcu<E> {

    private static CalculadoraGeneral calcu; //se guarda la calculadora

    private SingletonCalcu(Stack fe){
        CalculadoraJessJac Calss = new CalculadoraJessJac(fe);
        calcu = Calss; //Aqui se pone que tipo de Stack se Quiere
    }

    public static CalculadoraGeneral getCalcu(Stack entry){
        if(calcu==null){
            new SingletonCalcu(entry);
        }

        return calcu;
    }
}
