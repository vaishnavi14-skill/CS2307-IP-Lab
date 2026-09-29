import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/URLRewriteServlet")
public class URLRewrite extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();


        // GET EMAIL FROM URL

        String email = request.getParameter("email");


        out.println("<html>");

        out.println("<head>");

        out.println("<title>URL Rewriting Result</title>");


        // INTERNAL CSS

        out.println("<style>");

        out.println("body {");
        out.println("margin: 0;");
        out.println("font-family: Arial, sans-serif;");
        out.println("background: linear-gradient(135deg, #e0f2f1, #cfd8dc);");
        out.println("min-height: 100vh;");
        out.println("display: flex;");
        out.println("justify-content: center;");
        out.println("align-items: center;");
        out.println("}");

        out.println(".box {");
        out.println("width: 450px;");
        out.println("background: white;");
        out.println("padding: 35px;");
        out.println("border-radius: 15px;");
        out.println("box-shadow: 0px 8px 25px rgba(0,0,0,0.3);");
        out.println("text-align: center;");
        out.println("}");

        out.println("h2 {");
        out.println("color: #263238;");
        out.println("margin-bottom: 20px;");
        out.println("}");

        out.println("p {");
        out.println("line-height: 1.7;");
        out.println("color: #555;");
        out.println("font-size: 15px;");
        out.println("}");

        out.println("</style>");

        out.println("</head>");


        out.println("<body>");

        out.println("<div class='box'>");


        out.println("<h2>Hello, " + email + "</h2>");

        out.println("<p>");

        out.println("This value was passed using URL Rewriting.");

        out.println("<br><br>");

        out.println("The value is visible in the browser address bar as a query parameter.");

        out.println("</p>");


        out.println("</div>");

        out.println("</body>");

        out.println("</html>");
    }
}