package collections.app;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // ===================== EXERCISES ========================
   //  List<String> funcionarios = new ArrayList<>();

     //funcionarios.add("João");
     //funcionarios.add("Maria");
     //funcionarios.add("Vitor");
     //funcionarios.add("Ana");

      //  System.out.println("Lista de funcionarios: " + funcionarios);

        List<String> listaEstudantes = new ArrayList<>();
        listaEstudantes.add("Joana");
        listaEstudantes.add("Lucas");
        listaEstudantes.add("Pedro");
        listaEstudantes.add("Antônio");

        System.out.println("Lista de estudantes: " + listaEstudantes);
        listaEstudantes.remove("Pedro");
        System.out.println("Lista após a exclusão: " + listaEstudantes);


        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antonio");


        System.out.println("A segunda pessoa da lista é: "+funcionarios.get(1));
        System.out.println("Total de funcionarios: "+funcionarios.size());


       Set<String> eventos = new HashSet<>();
       eventos.add("IA Conference Brasil");
       eventos.add("AI Summit");
       eventos.add("DevFest");
       eventos.add("Cloud Expo");
       eventos.add("IA Conference Brasil");
       eventos.add("DevFest");

        System.out.println("Lista de eventos: " + eventos);



      //  Map<Integer,String> clientes = new HashMap<>();

     //   clientes.put(1,"Pedro");
    //    clientes.put(2,"Marcos");
     //   clientes.put(3,"Antonio");

    //    System.out.println("O nome do cliente com ID 2 é: "+clientes.get(2));

        Map<Integer,String> clientes = new HashMap<>();
        clientes.put(1,"Maria");
        clientes.put(2,"Marcos");
        clientes.put(3,"Ana");
        clientes.put(4,"Joana");
        clientes.put(5,"Karen");

        int idCliente = 5;


        if(clientes.containsKey(idCliente)){
            System.out.println("O noome do cliente  com ID " + idCliente + " é: " + clientes.get(idCliente));
        } else {
            System.out.println("Cliente com ID " + idCliente + " não foi encontrado");
        }


        List<String> funcionarios2 = List.of("Ana","Bruno","Carlos","Amanda","Alice","Daniel","Caroline");
        List<String> funcionariosFiltrados = funcionarios2.stream().filter(f -> f.length()<=5).collect(Collectors.toList());
        System.out.println(funcionariosFiltrados);

        List<Integer> numeros = List.of(2,3,5,7,11);
       List<Integer> quadradoDosNumeros = numeros.stream().map(number -> number*number).collect(Collectors.toList());

        System.out.println("Quadrado dos números: "+ quadradoDosNumeros);


        List<Double> precoProdutos = List.of(29.99,49.50,15.75,99.99);
        double totalVenda = precoProdutos.stream().reduce(0.0, Double::sum);
        System.out.println("Valor total antes do imposto: "+ totalVenda);
        double totalVendaPosImposto = precoProdutos.stream().map(v -> v*1.08).reduce(0.0, Double::sum);
        System.out.println("Valor total pos imposto: "+ String.format("%.2f",totalVendaPosImposto));


        List<Double> notas = List.of(7.5,8.0,6.5,9.0,10.0);
        double mediaNotas = notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        double menorNota = notas.stream().min(Double::compare).get();
        double maiorNota = notas.stream().max(Double::compare).get();


        System.out.printf("A média das notas é: %.2f%nA menor nota foi: %.2f%nA maior nota foi: %.2f%n",
                mediaNotas, menorNota, maiorNota);




    }
}
