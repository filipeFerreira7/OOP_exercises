package model;

public class Gato extends Animal {
    private String cor;

    public void imprimir(){
        super.imprimir();
        System.out.println("Cor do pet: "+ cor);
        fazerSom();
    }

    //polimorfismo
    @Override
    public void fazerSom(){
        System.out.println("MIAU");
    }

    public Gato() {
        super();
        this.cor = getCor();
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
