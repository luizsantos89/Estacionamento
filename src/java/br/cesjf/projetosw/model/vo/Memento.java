package br.cesjf.projetosw.model.vo;

public class Memento {
    protected String estadoEstacionamento;
    
    public Memento(String estado) {
        estadoEstacionamento = estado;
    }
    
    public String getEstado() {
        return estadoEstacionamento;
    }
}
