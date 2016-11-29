
package br.cesjf.projetosw.controller;

public interface Pagamento {
    double processarPagamento(int tipoVeiculo, int tipoPagamento, int tipoCliente, double qtdeHoras);
}
