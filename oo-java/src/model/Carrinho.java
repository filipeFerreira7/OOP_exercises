package model;

public class Carrinho {
    private String nome;
    private double preco;
    private int qtd;


    public Double valorTotal() {
        return preco * qtd;
    }

    public static void imprimir(double total) {
        System.out.printf("Total da compra: R$ %.2f\n", total);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

