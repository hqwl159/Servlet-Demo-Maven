import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>ClassName      ServletDemo
 * <p>Description
 * <p>Author
 * <p>Version
 * <p>Date           2020/10/20 12:17 PM
 */

//@WebServlet(name = "ServletDemo" ,urlPatterns = "/home")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getParameter("param"));
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        final PrintWriter out = resp.getWriter();
        out.println("demo test");
    }
}
