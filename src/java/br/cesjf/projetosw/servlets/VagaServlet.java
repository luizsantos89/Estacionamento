package br.cesjf.projetosw.servlets;

import br.cesjf.projetosw.model.dao.Ocorrencia;
import br.cesjf.projetosw.model.vo.Cliente;
import br.cesjf.projetosw.model.vo.Vaga;
import br.cesjf.projetosw.model.vo.VagaCarro;
import br.cesjf.projetosw.model.vo.VagaMoto;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VagaServlet", urlPatterns = {"/VagaServlet"})
public class VagaServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        request.getRequestDispatcher("/WEB-INF/registro-estacionamento.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String id_cliente = request.getParameter("cliente");
        int tipoVaga = Integer.parseInt(request.getParameter("vaga"));
        Vaga vaga;
        Ocorrencia ocorrencia = new Ocorrencia();
        Cliente cliente = new Cliente();
                
        
        if(tipoVaga==1) {
            vaga = new VagaCarro();
        } else {
            vaga = new VagaMoto();
        }
        
        ocorrencia.setCliente(cliente);
        ocorrencia.setVaga(vaga);
        ocorrencia.setHoraEntrada(new Date());
        ocorrencia.setTipoVeiculo(tipoVaga);
        
        request.setAttribute("ocorrencia",ocorrencia);
        
        request.getRequestDispatcher("consulta-ocorrencia.jsp").forward(request, response);
    }

}
