package model;

public class Colaborador {
    private String nome;
    private String cargo;
    private String novoCargo;
    private int nivelAcesso;


    public void imprimir(){
        System.out.println("==============Antes da atualizacao ============");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo atual: " + cargo);
        System.out.println("Nivel de acesso: " + nivelAcesso);

        System.out.println("\n ============== Depois da atualizacao");
        System.out.println("Nome: " + nome);
        updateCargo("Pessoa dev plena");
        updateNivelAcesso(2);
    }

    public void updateCargo(String novoCargo){
        setNovoCargo(novoCargo);
        setCargo(getNovoCargo());
        System.out.printf("Cargo: %s\n", getCargo());

    }
    public void updateNivelAcesso(int novoNivelAcesso){
        setNivelAcesso(novoNivelAcesso);
        System.out.printf("Nivel de acesso: %d\n", novoNivelAcesso);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNovoCargo() {
        return novoCargo;
    }

    public void setNovoCargo(String novoCargo) {
        this.novoCargo = novoCargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}

