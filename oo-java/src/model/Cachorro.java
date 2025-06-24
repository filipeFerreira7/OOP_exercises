package model;

public class Cachorro extends Animal {
    private String raca;
    private String cor;

    public void imprimir() {
        super.imprimir();
        System.out.println("Raça do pet: " + raca);
        System.out.println("Cor do pet: " + cor);
        fazerSom();
    }

    //polimorfismo
    @Override
    public void fazerSom(){
        System.out.println("AU AU");
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
