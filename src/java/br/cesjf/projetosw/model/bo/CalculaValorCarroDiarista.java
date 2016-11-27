
package br.cesjf.projetosw.model.bo;

public class CalculaValorCarroDiarista extends CalculaValor {   
    public double ValorTotal(double valor, int segundos) {
        return valor*(segundos/3600);
    }
}
