package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by aremo on 2/3/2017.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("login");
        String haslo = request.getParameter("haslo");
        String zaloguj = request.getParameter("zaloguj");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.print("<html>");

        writer.print("<head>");
        writer.print("<title>login</title>");
        writer.print("</head>");

        writer.print("<body>");
        if (login.equals("kasia") && haslo.equals("malediwy")) {
            writer.print("Logowanie zakończyło się powodzeniem!");

        } else {
            writer.print("Niepoprawny login lub hasło!");
        }

        writer.print("</body>");

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
