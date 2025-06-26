package heranca_polimorfismo_interface.model;

public class Docente extends Pessoa {
    private String disciplina;


    public void exibirDados() {
        System.out.printf("Docente: %s - Idade: %s - Disciplina: %s\n", super.getNome(), super.getIdade(), disciplina);
    }

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
