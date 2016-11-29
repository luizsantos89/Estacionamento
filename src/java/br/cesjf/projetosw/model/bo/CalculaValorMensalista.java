
package br.cesjf.projetosw.model.bo;

import br.cesjf.projetosw.model.vo.Cliente;

public class CalculaValorMensalista implements CalculaValor{
    @Override
    public double calculaValorAPagar(Cliente cliente) {
        if (cliente.isMensalista()==true) {
            return 1200.00;
        } else {
            return 2.50;
        }
    }    
}
