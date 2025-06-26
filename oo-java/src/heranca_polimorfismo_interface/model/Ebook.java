package heranca_polimorfismo_interface.model;

import java.time.Year;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, Year ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    @Override
    public void formatLib(){
        var oneChar = titulo.charAt(0);
        var twoChar = titulo.charAt(1);
        var threeChar = titulo.charAt(2);

        System.out.println("Código: LIB-"+oneChar+twoChar+threeChar+ano+" | " + "Ebook: "+ titulo +" - Formato: " + formato);
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
