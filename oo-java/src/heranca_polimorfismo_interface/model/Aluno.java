package heranca_polimorfismo_interface.model;

public class Aluno {
    private String nome;
    private String tipo;


    public void identificar(){
        System.out.printf("Aluno %s - Tipo: %s\n", nome, tipo);
    }

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
