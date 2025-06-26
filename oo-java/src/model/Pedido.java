package model;

public class Pedido {
    private String titulo;
    private int diasAtraso;
    private double valorTotal;


    public double multaAtraso() {

        for(int i = 0; i < diasAtraso; i++) {
           valorTotal = diasAtraso * 2.5;
        }

        return valorTotal;
    }

    public void imprimir(){
        System.out.printf("Livro: %s | Multa por %s dias de atraso: -R$ %.2f\n ",titulo,diasAtraso,multaAtraso());
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }
}
