
package br.cesjf.projetosw.model.bo;

import br.cesjf.projetosw.model.vo.Cliente;

public class CalculaValorHorista implements CalculaValor{
    @Override
    public double calculaValorAPagar(Cliente cliente) {
        if (cliente.isMensalista()==false) {
            return 2.50;
        } else {
            return 1200.00;
        }
    }    
}
