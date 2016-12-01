
package br.cesjf.projetosw.model.vo;

public class Texto {
    protected String texto;
    EstacionamentoCareTaker caretaker;
    
    public Texto() {
    caretaker= new EstacionamentoCareTaker();
    texto = new String();
    }
    public void escreverTexto(String novoTexto) {
    caretaker.adicionarMemento(new Memento(texto));
    texto += novoTexto;
    }
    public void desfazerEscrita() {
    texto = caretaker.getUltimoEstadoSalvo().getEstado();
    }
    public void mostrarTexto() {
    System.out.println(texto);
    }
}