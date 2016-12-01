
package br.cesjf.projetosw.model.bo;

import br.cesjf.projetosw.model.vo.Cliente;
import br.cesjf.projetosw.model.vo.Vaga;

interface CalculaValor {
    double calculaValorAPagar(Cliente cliente);
}
