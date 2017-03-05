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
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//odbieramy żądanie
        request.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("imie");
        String lastName = request.getParameter("nazwisko");
        String age = request.getParameter("wiek");
//wysyłamy odpowiedź
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.print("<html>");

        writer.print("<head>");
        writer.print("<title>Witaj</title>");
        writer.print("</head>");

        writer.print("<body>");
        writer.print("<h1>");
        if (firstName != null) {
            writer.println("Cześć " + firstName + "! ");
        } else {
            writer.println("Cześć Nieznajomy! ");
        }
        writer.print("</h1>");
        writer.print("<br>");

        if (lastName != null) {
            writer.println("Wiem, że masz na nazwisko " + lastName + ". ");
        } else {
            writer.println("Niestety nie wiem, jak masz na nazwisko. ");
        }
        writer.print("<br>");

        if (age != null) {
            writer.println("Też kiedyś miałem " + age + " lat.");
        } else {
            writer.println("Ja też nie lubię się chwalić wiekiem.");
        }
        writer.print("<br>");

        writer.print("<img src=\"http://img.cda.pl/obr/oryginalne/850ca7d90566b9ed82c60d9d50771230.jpg\">");

        writer.print("</body>");

        writer.println("</html>");
    }
}
