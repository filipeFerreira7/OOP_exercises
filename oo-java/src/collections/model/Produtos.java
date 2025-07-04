package collections.model;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    public int id;
    public String nome;
    public double preco;


    public Produtos(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Produtos: " + "id: " + id + " -"+
                " nome - " + nome +
                " preco - " + preco ;
    }
}
