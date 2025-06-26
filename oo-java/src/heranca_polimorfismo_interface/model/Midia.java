package heranca_polimorfismo_interface.model;

import java.time.Year;
import java.util.Date;

public abstract class Midia {
    public String titulo;
    public Year ano;

    public Midia(String titulo, Year ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void formatLib(){
        var oneChar = titulo.charAt(0);
        var twoChar = titulo.charAt(1);
        var threeChar = titulo.charAt(2);

        System.out.println("Código: LIB-"+oneChar+twoChar+threeChar+ano+" | ");
    }

        public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(Year ano) {
        this.ano = ano;
    }
}
