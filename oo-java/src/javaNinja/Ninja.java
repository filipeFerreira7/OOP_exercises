package javaNinja;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    //polimorfismo -> declarar um comportamento em várias classes com diferentes características
    //sobrescrita -> reaproveitar o metodo de uma classe com o @override

    //sobrecarga -> usar o mesmo nome de método apenas com numero e tipo de atributos diferentes
    public void lancarKunai(){
        System.out.println("Lançando Kunai");
    }
    public void lancarKunai(String estilo){
    }
    public void lancarKunai(double pesoKunai){

    }
}
