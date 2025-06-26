package heranca_polimorfismo_interface.model;

import java.time.Year;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, Year ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }
    @Override
    public void formatLib(){
        var oneChar = titulo.charAt(0);
        var twoChar = titulo.charAt(1);
        var threeChar = titulo.charAt(2);

        System.out.println("Código: LIB-"+oneChar+twoChar+threeChar+ano+" | "+ "Livro: "+titulo + "- Autor: " + autor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
