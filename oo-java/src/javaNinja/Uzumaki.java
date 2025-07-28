package javaNinja;

public class Uzumaki extends Ninja {

    public void modoSeninAtivado(){
        System.out.println("Meu nome é "+ nome +" e eu ativo o modo sábio.");
    }

    @Override
    public void lancarKunai(){
        System.out.println("estou lançando a kunai com o modo sábio");
    }
}
