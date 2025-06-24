package model;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir() {
        System.out.printf("Funcionario %s - Cargo %s - Salario %.2f",
                nome,cargo,salario);

//        System.out.printf("Nome: " + nome);
//        System.out.println("Cargo: " + cargo);
//        System.out.println("Salario: " + salario);
//
    }


    public void fixSalario(double percentual) {
        var percent = getSalario() * (percentual / 100);
        setSalario(getSalario() + percent);
        System.out.printf("Salario Fixado de %s é %.2f",nome,salario);
    }
}
