package model;

public abstract class Animal implements  Comportamento {
    private String nome;
    private String sexo;

    public void imprimir(){
        System.out.println("Nome do pet: "+ nome);
        System.out.println("Sexo do pet: "+ sexo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

