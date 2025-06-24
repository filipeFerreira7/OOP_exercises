package model;

public class Tarefa {
    private String descricao;
    private boolean status;
    private String concluida;

    public void imprimir(){
        System.out.printf("Tarefa: %s - Status: %s", descricao, concluida);
    }

    public String message(){
        if(status){
            concluida = "Concluída";
        }
        else{
            concluida = "Pendente";
        }
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getConcluida() {
        return concluida;
    }

    public void setConcluida(String concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa: " +
                descricao + " -" +
                " Status: " + message();
    }
}
