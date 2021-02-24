public class Singleton<E> {

    private Stack datos; //se guarda el stack


    private void Singleton(String entry){
        StackFactory StFc = new StackFactory();
        datos = StFc.getStack(entry); //Aqui se pone que tipo de Stack se Quiere
    }

    public Stack getStack(String entry){
        if(datos==null){
            Singleton(entry);
        }

        return datos;
    }
}
