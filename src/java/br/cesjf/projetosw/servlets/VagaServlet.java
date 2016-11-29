package br.cesjf.projetosw.servlets;


import br.cesjf.projetosw.model.vo.Vaga;
import br.cesjf.projetosw.model.vo.VagaCarro;
import br.cesjf.projetosw.model.vo.VagaMoto;
import java.io.IOException;
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
        
        request.getRequestDispatcher("/WEB-INF/cadastro-vaga.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        Vaga vaga;
        
        if(request.getParameter("tipo").equals("1")) {
            vaga = new VagaCarro();
            vaga.setVagaCarro(true);
            vaga.setVagaMoto(false);
        } else {
            vaga = new VagaMoto();
            vaga.setVagaCarro(false);
            vaga.setVagaMoto(true);
        }
        
        vaga.setDescricao(request.getParameter("descricao"));        
            
        request.setAttribute("vaga",vaga);        
        request.getRequestDispatcher("/WEB-INF/detalhes-vaga.jsp").forward(request, response);
    }

}
