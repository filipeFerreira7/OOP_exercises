package polimorfismo;

public class Funcionario extends Pessoa {
    @Override // já nao é mais um metodo criado da classe funcionário, é o método da classe pessoa que será usado para um novo comportamento
    public void falar(){
        System.out.println("Eu sou um funcionário");
    }
}
