
package br.cesjf.projetosw.servlets;

import br.cesjf.projetosw.controller.Pagamento;
import br.cesjf.projetosw.controller.PagamentoAVista;
import br.cesjf.projetosw.controller.PagamentoCartao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PagamentoServlet", urlPatterns = {"/PagamentoServlet"})
public class PagamentoServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/efetuar-pagamento.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String cliente = request.getParameter("cliente");
        String tipoDeCliente;
        String formaDePgto;
        String tipoDeVeiculo;
        
        //cliente=Maria&formaPgto=1&tipoCliente=2&qtdeHoras=6&tipoVeiculo=1
        
        double valorPagamento;
        double qtdeHoras;
        if (request.getParameter("qtdeHoras") == ""){
            qtdeHoras = 0;
        } else {
            qtdeHoras = Double.parseDouble(request.getParameter("qtdeHoras"));
        }
        int tipoPgto = Integer.parseInt(request.getParameter("formaPgto"));
        int tipoCliente = Integer.parseInt(request.getParameter("tipoCliente"));
        int tipoVeiculo = Integer.parseInt(request.getParameter("tipoVeiculo"));
        
        Pagamento pagamento;
        if (tipoPgto==1) {
            pagamento = new PagamentoAVista();
            formaDePgto = "A Vista";
        } else {
            pagamento = new PagamentoCartao();
            formaDePgto = "Cartão";
        }
        
        if(tipoCliente==1)
            tipoDeCliente = "Mensalista";
        else 
            tipoDeCliente = "Horista";
        
        if(tipoVeiculo==1)
            tipoDeVeiculo = "Carro";
        else
            tipoDeVeiculo = "Moto";
        
        valorPagamento = pagamento.processarPagamento(tipoVeiculo, tipoPgto, tipoCliente, qtdeHoras);
        
        
        request.setAttribute("valorPago", valorPagamento);
        request.setAttribute("cliente", cliente);
        request.setAttribute("tipoDeCliente",tipoDeCliente);
        request.setAttribute("formaDePgto", formaDePgto);
        request.setAttribute("tipoDeVeiculo", tipoDeVeiculo);
        
        request.getRequestDispatcher("/WEB-INF/pagamento-efetuado.jsp").forward(request, response);
        
    }
    
}
