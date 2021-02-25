public final class Singleton<E> {

    private static Stack datos; //se guarda el stack


    private Singleton(String entry){
        StackFactory StFc = new StackFactory();
        datos = StFc.getStack(entry); //Aqui se pone que tipo de Stack se Quiere
    }

    public static Stack getStack(String entry){
        if(datos==null){
            new Singleton(entry);
        }

        return datos;
    }
}
