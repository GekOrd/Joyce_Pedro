package br.edu.iff.tp1pedro2019.servlets;


import br.edu.iff.tp1pedro2019.entidades.Usuario;
import br.edu.iff.tp1pedro2019.utilidades.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MeuPrimeiroServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo:" + nomeCompleto);
        String senha = request.getParameter("senha");
        String cidade = request.getParameter("cidade");
        String cep = request.getParameter("cep");

        Usuario user = new Usuario();
        user.setNome(nomeCompleto);
        user.setSenha(senha);
        user.setEndMunicipio(cidade);
        user.setEndCep(Integer.SIZE);

        Double aleatorio = Math.random();
        BigDecimal id = new BigDecimal(aleatorio);
        user.setIdUsuario(id);

        Session sessaoBD = HibernateUtil.getSession();
        Transaction tr = sessaoBD.beginTransaction();
        sessaoBD.save(user);
        tr.commit();
        sessaoBD.close();
        
        response.sendRedirect("ordePecyoJ.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
