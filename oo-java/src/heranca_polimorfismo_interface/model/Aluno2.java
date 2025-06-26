package heranca_polimorfismo_interface.model;

public class Aluno2 extends Pessoa {
    private double nota;



    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %s - Nota: %.2f\n", super.getNome(), super.getIdade(), nota);
    }

    public Aluno2(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
