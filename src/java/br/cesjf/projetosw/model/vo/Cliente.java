

package br.cesjf.projetosw.model.vo;

public class Cliente {
    private String nome;
    private boolean mensalista;
    
    public Cliente() {
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean isMensalista() {
        return mensalista;
    }
    
    public void setMensalista(boolean mensalista) {
        this.mensalista = mensalista;
    }
    
}
