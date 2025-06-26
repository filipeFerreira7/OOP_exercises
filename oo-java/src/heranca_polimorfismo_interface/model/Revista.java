package heranca_polimorfismo_interface.model;

import java.time.Year;

public class Revista extends Midia{
    private String edicao;


    public Revista(String titulo, Year ano, String edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    @Override
    public void formatLib(){
        var oneChar = titulo.charAt(0);
        var twoChar = titulo.charAt(1);
        var threeChar = titulo.charAt(2);

        System.out.println("Código: LIB-"+oneChar+twoChar+threeChar+ano+" | " + "Revista "+titulo + " - Edição: " + edicao);

    }
}
