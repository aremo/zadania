package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by aremo on 2/3/2017.
 */
@WebServlet("/calculator")
public class Servlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number1 = request.getParameter("num1");
        String number2 = request.getParameter("num2");

        int value1 = Integer.valueOf(number1);
        int value2 = Integer.valueOf(number2);

        System.out.println("sum: " + (value1 + value2));
        System.out.println("dif: " + (value1 - value2));
        System.out.println("prod: " + (value1 * value2));
        System.out.println("quot: " + (value1 / value2) + "\n");

    }
}
