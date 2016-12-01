package br.cesjf.projetosw.model.vo;

public class Usuario {
    private String nome;
    
    public static Usuario instancia;
    
    protected Usuario() {
    
    }
    
    public static Usuario getInstance() {
        if (instancia == null)
            instancia = new Usuario();
        return instancia;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
