package polimorfismo;

public class Pessoa {
    //Polimorfismo = Várias formas de fazer uma coisa. Polimorfismo aplicado
    //sobreescrita (@Override), sobrecarga.

    //Sobrecarga = Vários métodos com comportamento diferente
    public void falar(){
        System.out.println("Oi");
    }
    public void falar(String texto){
        System.out.println("Fulano disse: " + texto);
    }

    public void falar(Double num){
        System.out.println("O número que fulano escolheu foi: " +  num);
    }
}
