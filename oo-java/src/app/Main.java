package app;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Filipe");
        funcionario.setCargo("Repositor");
        funcionario.setSalario(5000);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Joao");
        funcionario2.setCargo("Dev");
        funcionario2.setSalario(8500);


      //  funcionario2.imprimir();
        //funcionario2.fixSalario(5);

// ======== Atividades Módulo 1 ========

        Produto produto = new Produto();
        produto.setNome("Mouse Gamer");
        produto.setQuantidade(25);
        produto.setPreco(159.9);

      //  produto.imprimir();
        Livro livro = new Livro();
        livro.setTitulo("O Guia do Mochileiro das Galáxias");
        livro.setAutor("Douglas Adams");
        livro.setPaginas(208);

     //   livro.imprimir();

        Conta cc = new Conta();
        cc.setSaldo(1000);
//        cc.imprimir();
//        cc.zerarSaldo();
//        cc.imprimir();

        Sensor sensor = new Sensor();
        sensor.setLocal("Setor A");
        sensor.setTemperatura(39.2);
     //   sensor.imprimir();

        Aluno aluno = new Aluno();
        aluno.setNome("João Silva");
        aluno.setNota1(6.5);
        aluno.setNota2(7.5);
      //  aluno.imprimir();

        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Júlia Oliveira");
        colaborador.setCargo("Pessoa dev Júnior");
        colaborador.setNivelAcesso(1);
       // colaborador.imprimir();

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Estudar Java");
        tarefa.setStatus(false);

        Tarefa tarefa2 = new Tarefa();
        tarefa2.setDescricao("Fazer exercícios");
        tarefa2.setStatus(true);

        List<Tarefa> tarefas = new ArrayList<Tarefa>();

        tarefas.add(tarefa);
        tarefas.add(tarefa2);

    //    tarefas.forEach(System.out::println);

        Item item = new Item();
        item.setNome("Camiseta");
        item.setQuantidade(10);

       // item.vender(3);
       // item.vender(8);

        Pedido pedido = new Pedido();
        pedido.setTitulo("Dom Casmurro");
        pedido.setDiasAtraso(4);

       // pedido.imprimir();

        Carrinho c1 = new Carrinho();
        c1.setNome("Teclado");
        c1.setPreco(120.0);
        c1.setQtd(1);

        Carrinho c2 = new Carrinho();
        c2.setNome("Mouse");
        c2.setPreco(60.0);
        c2.setQtd(2);

        List<Carrinho> carrinho = new ArrayList<>();
        carrinho.add(c1);
        carrinho.add(c2);

        double total = 0;
        for (Carrinho valor : carrinho) {
           total += valor.valorTotal();
        }
      //  Carrinho.imprimir(total);

        // -------- Herança

        Gato gato = new Gato();
        gato.setNome("Apolo");
        gato.setCor("Branco");
        gato.setSexo("Macho");

        gato.imprimir();
        System.out.println("\n==================== \n");
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Buddy");
        cachorro.setRaca("Golden Retriever");
        cachorro.setCor("Golden");
        cachorro.setSexo("Macho");

        cachorro.imprimir();



    }

    }
