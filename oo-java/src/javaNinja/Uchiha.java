package javaNinja;

public class Uchiha extends Ninja {
    public void sharinganAtivado(){
        System.out.println("Meu nome é "+nome +" e eu ativo meu sharingan. Eu sou um Uchiha");
    }

    @Override
    public void lancarKunai() {
        System.out.println("Estou lançando a kunai com o Sharingan");
    }
}
