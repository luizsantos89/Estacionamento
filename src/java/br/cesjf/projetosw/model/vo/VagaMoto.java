
package br.cesjf.projetosw.model.vo;

public class VagaMoto implements Vaga {
    private String descricao;
    private boolean vagaCarro;
    private boolean vagaMoto;
    
    @Override
    public void criarVaga() {
        System.out.println("");
    }
    
    public VagaMoto() {
        
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public boolean isVagaMoto() {
        return vagaMoto;
    }
    
    @Override
    public void setVagaMoto(boolean vagaMoto) {
        this.vagaMoto = vagaMoto;
    }

    public boolean isVagaCarro() {
        return vagaCarro;
    }
    
    @Override
    public void setVagaCarro(boolean vagaCarro) {
        this.vagaCarro = vagaCarro;
    }
}
