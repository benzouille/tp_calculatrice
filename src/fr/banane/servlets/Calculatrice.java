package fr.banane.servlets;

import fr.banane.model.Calcul;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculatrice")
public class Calculatrice extends HttpServlet {

    public Calculatrice(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("in doPost");

        Calcul calcul = new Calcul();
        String resultat;

        resultat = calcul.getResult(request.getParameter("num_1"), request.getParameter("signe"),  request.getParameter("num_2"));

        request.setAttribute("resultat", resultat);

        this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        System.out.println("in doGet");

        this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
    }
}
