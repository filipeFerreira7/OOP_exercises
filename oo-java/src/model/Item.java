package model;

public class Item {
    private String nome;
    private int quantidade;

    public void vender(int qtdVendido){
     if(qtdVendido <= quantidade){
         quantidade -= qtdVendido;
         System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
     } else{
         System.out.println("Estoque insuficiente");
     }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
