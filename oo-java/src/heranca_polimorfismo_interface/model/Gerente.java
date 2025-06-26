package heranca_polimorfismo_interface.model;

public class Gerente extends Funcionario implements Aprovador {
    private double bonus;


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void imprimir() {
        System.out.printf("Gerente: %s\n - salário: %.2f\n - bônus: %.2f", super.getNome(), super.getSalario(), bonus);
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("\n Gerente %s aprovou o projeto %s\n", super.getNome(), nomeProjeto);
    }
}
