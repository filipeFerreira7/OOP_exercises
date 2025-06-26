package heranca_polimorfismo_interface.model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimir() {
        System.out.printf("\nFuncionario %s\n - Salario %.2f\n",
                nome,salario);

//        System.out.printf("Nome: " + nome);
//        System.out.println("Cargo: " + cargo);
//        System.out.println("Salario: " + salario);
//
    }

    //Sobrecarga - Mudança de atributos
    public void fixSalario(double percentual) {
        var percent = getSalario() * (percentual / 100);
        setSalario(getSalario() + percent);
        System.out.printf("\n Salario Fixado de %s é %.2f",nome,salario);
    }

    public void fixSalario() {
        salario += 500;
        System.out.printf("\n Salario com dissídio de %s é %.2f",nome,salario);
    }
}
