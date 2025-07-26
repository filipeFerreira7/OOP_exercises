package polimorfismo;

public class Conta implements Pagar {
    @Override
    public void pagar() {
        System.out.println("Pix");
    }

    public void pagar(String tipo){

    }
//    //sobrecarga
//    public void pagar(){
//    }
//    public void pagar(int codOpcao){
//    }
//    public void pagar(String textoOpcao){
//    }
//    public void pagar( String txt, int cod){
//
//    }
}
