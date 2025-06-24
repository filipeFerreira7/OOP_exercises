package model;

public class Sensor {
    private String local;
    public double temperatura;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void imprimir() {
        System.out.printf("Sensor no Local : %s\n Temperatura atual: %s ºC", local, temperatura);
        alerta();
    }

    public void alerta(){
        if(temperatura > 37.5) {
            System.out.println("\n Alerta: Temperatura acima do limite! ");
        }
        return;
    }
}
