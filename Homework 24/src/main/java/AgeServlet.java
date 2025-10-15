import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "AgeServlet", urlPatterns = {"/comingOfAge"})
public class AgeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        int age = Integer.parseInt(req.getParameter("age"));
        Writer out = resp.getWriter();
        System.out.println("Введите ваш возраст: ");
        if (age < 18 && age > 0) {
            out.append("<html>Не совершеннолетний.</html>");
        }
        else if (age >= 18) {
            out.append("<html>Совершеннолетний.</html>");
        }
    }
}
