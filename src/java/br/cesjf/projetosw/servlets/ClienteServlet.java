/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.projetosw.servlets;

import br.cesjf.projetosw.model.vo.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luiz
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/cadastro-cliente.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getParameter("nome"));
        if (request.getParameter("tipo").equals("1")) {
            cliente.setMensalista(false);
        } else {
            cliente.setMensalista(true);
        }
        
        request.setAttribute("cliente", cliente);
        request.getRequestDispatcher("/WEB-INF/detalhes-cliente.jsp").forward(request, response);
    }
}
