
package br.cesjf.projetosw.controller;

import br.cesjf.projetosw.model.dao.Ocorrencia;
import br.cesjf.projetosw.model.vo.Cliente;

public class PagamentoAVista implements Pagamento {
    double valorPagamento;
    double valorHora = 50;

    @Override
    public double processarPagamento(int tipoVeiculo, int tipoPgto, int tipoCliente, double qtdeHoras){
        double valorHora;
        double valorFixo;
        double desconto; 
        double valorTotal;
        
        if (tipoVeiculo == 1) {
            valorHora = 4.50;
            valorFixo = 1200.00;
        } else {
            valorHora = 4.00;
            valorFixo = 1000.00;
        }
        
        if (tipoPgto==1){
            desconto = 0.90;
        } else {
            desconto = 1.0;
        }
        
        if(tipoCliente==1){
            valorTotal = valorFixo * desconto;
        } else {
            valorTotal = valorHora * qtdeHoras * desconto;
        }
        
        return valorTotal;
    }
    
    public PagamentoAVista(){
        
    }
}
