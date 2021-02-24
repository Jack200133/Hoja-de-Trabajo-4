public class Singleton<E> {

    private Stack datos; //se guarda el stack


    private void Singleton(){
        StackFactory StFc = new StackFactory();
        datos = StFc.getStack("SL"); //Aqui se pone que tipo de Stack se Quiere
    }

    public Stack getStack(){
        if(datos==null){
            Singleton();
        }

        return datos;
    }
}
