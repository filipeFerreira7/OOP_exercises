package heranca_polimorfismo_interface.model;

public class Bolsista extends Aluno {

    public Bolsista(String nome) {
        super(nome, "bolsista");
    }

    @Override
    public void identificar() {
        System.out.printf("Aluno %s - Tipo: %s\n", super.getNome(), super.getTipo());
    }
}
