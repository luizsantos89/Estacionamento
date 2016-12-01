
package br.cesjf.projetosw.servlets;

import br.cesjf.projetosw.model.vo.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String login = request.getParameter("login");        
        
        Usuario usuario = Usuario.getInstance();
        
        usuario.setNome(login);
        
        //Criando sessão
        HttpSession session = request.getSession(true);
        session.setAttribute(login, login);
        
        request.setAttribute("login", login);
        
        request.getRequestDispatcher("index.html").forward(request, response);
        
    }
}
