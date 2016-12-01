package br.cesjf.projetosw.model.vo;

import java.util.ArrayList;

public class EstacionamentoCareTaker {
    protected ArrayList<Memento> estados;
    
    public EstacionamentoCareTaker() {
        estados = new ArrayList<Memento>();
    }
    
    public void adicionarMemento(Memento memento) {
        estados.add(memento);
    }
    
    public Memento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new Memento("");
        }
        Memento estadoSalvo = estados.get(estados.size() -1);
        estados.remove(estados.size() -1);
        return estadoSalvo;
    }
}
