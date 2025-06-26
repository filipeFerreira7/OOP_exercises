package heranca_polimorfismo_interface.app;

import heranca_polimorfismo_interface.model.*;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Filipe", 15000);
        ((Gerente) gerente).setBonus(1000);
     //   gerente.imprimir();
    //    gerente.fixSalario(2);
    //    ((Gerente) gerente).aprovarProjeto("Invite Us");


       Funcionario desenvolvedor = new Desenvolvedor("Carla", 12000, "BackEnd Java");
      // desenvolvedor.fixSalario();
     //   desenvolvedor.imprimir();



        /// /////======== Exercises ============== ////////

        Aluno aluno = new Aluno("Fernanda","regular");
        Bolsista aluno2 = new Bolsista("Lucas");
      //  aluno.identificar();
      //  aluno2.identificar();


        Docente docente = new Docente("Marta",40,"Matemática");
        Aluno2 aluno3 = new Aluno2("Julia", 16, 8.5);

      //  aluno3.exibirDados();
       // docente.exibirDados();

        Livro livro = new Livro("O Guia do Mochileiro das Galáxias", Year.of(1979), "Douglas Adams");
        Revista revista = new Revista("National Geographic", Year.of(2023), "245");
        Ebook ebook = new Ebook("Clean code", Year.of(2008), "PDF");

       // livro.formatLib();
       // revista.formatLib();
        // ebook.formatLib();
    }
}
