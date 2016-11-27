
package br.cesjf.projetosw.controller;

import br.cesjf.projetosw.model.dao.Ocorrencia;

public interface Pagamento {
    void processarPagamento(Ocorrencia ocorrencia);
}
