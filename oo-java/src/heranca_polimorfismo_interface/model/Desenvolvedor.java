package heranca_polimorfismo_interface.model;

public class Desenvolvedor extends Funcionario {
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void imprimir() {
        System.out.printf("\n Desenvolvedor: %s\n - salario: %.2f\n - Stack: %s\n", super.getNome(), super.getSalario(), stack );
    }
}
