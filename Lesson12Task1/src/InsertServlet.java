import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by aremo on 2/6/2017.
 */
@WebServlet("/insertN")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String nValue = request.getParameter("N");
        String confirm = request.getParameter("confirm");

        int n = Integer.valueOf(nValue);
        int i = 0;
        int sum = 0;

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.print("<html>");

        writer.print("<head>");
        writer.print("<title>SUMA</title>");
        writer.print("</head>");

        writer.print("<body>");

        while (i <= n) {
            if (i < n) {
                writer.print(i + "+");
            } else {
                writer.print(i); //albo n
            }
            sum += i;
            i++;
        }

        writer.println("<h1>");
        writer.println("=" + sum);
        writer.println("</h1>");

        writer.println("</body>");
        writer.println("</html>");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
