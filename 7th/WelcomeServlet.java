import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // GET EMAIL FROM LOGIN FORM
        String email = request.getParameter("email");

        // CREATE HTTP SESSION
        HttpSession session = request.getSession();

        // STORE EMAIL IN SESSION
        session.setAttribute("email", email);


        // ==============================
        // NUMBER OF VISITORS COUNT
        // ==============================

        ServletContext context = getServletContext();

        Integer visitorCount =
                (Integer) context.getAttribute("visitorCount");

        if (visitorCount == null) {
            visitorCount = 0;
        }

        visitorCount++;

        context.setAttribute("visitorCount", visitorCount);


        out.println("<html>");

        out.println("<head>");

        out.println("<title>Welcome</title>");


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
        out.println("width: 480px;");
        out.println("background: white;");
        out.println("padding: 35px;");
        out.println("border-radius: 15px;");
        out.println("box-shadow: 0px 8px 25px rgba(0,0,0,0.3);");
        out.println("text-align: center;");
        out.println("}");

        out.println("h2 {");
        out.println("color: #263238;");
        out.println("margin-bottom: 10px;");
        out.println("}");

        out.println(".success {");
        out.println("color: green;");
        out.println("font-weight: bold;");
        out.println("}");

        out.println(".visitor {");
        out.println("background: #e0f2f1;");
        out.println("padding: 12px;");
        out.println("border-radius: 8px;");
        out.println("margin: 15px 0;");
        out.println("font-weight: bold;");
        out.println("color: #263238;");
        out.println("font-size: 16px;");
        out.println("}");

        out.println("h3 {");
        out.println("color: #37474f;");
        out.println("margin-top: 25px;");
        out.println("}");

        out.println("button {");
        out.println("background: #37474f;");
        out.println("color: white;");
        out.println("border: none;");
        out.println("padding: 10px 20px;");
        out.println("border-radius: 6px;");
        out.println("cursor: pointer;");
        out.println("}");

        out.println("button:hover {");
        out.println("background: #263238;");
        out.println("}");

        out.println("a {");
        out.println("display: inline-block;");
        out.println("margin-top: 10px;");
        out.println("color: #37474f;");
        out.println("font-weight: bold;");
        out.println("text-decoration: none;");
        out.println("}");

        out.println("a:hover {");
        out.println("text-decoration: underline;");
        out.println("}");

        out.println("</style>");

        out.println("</head>");


        out.println("<body>");

        out.println("<div class='box'>");


        out.println("<h2>Welcome, " + email + "</h2>");

        out.println("<p class='success'>");
        out.println("Login Successful!");
        out.println("</p>");


        // NUMBER OF VISITORS DISPLAY

        out.println("<div class='visitor'>");
        out.println("Number of Visitors: " + visitorCount);
        out.println("</div>");


        // HIDDEN FIELD

        out.println("<h3>1. Hidden Form Field Demo</h3>");

        out.println("<form action='HiddenFieldServlet' method='post'>");

        out.println("<input type='hidden' name='email' value='"
                + email + "'>");

        out.println("<button type='submit'>");
        out.println("Go (Hidden Field)");
        out.println("</button>");

        out.println("</form>");


        // URL REWRITING

        out.println("<h3>2. URL Rewriting Demo</h3>");

        out.println("<a href='URLRewriteServlet?email="
                + email + "'>");

        out.println("Visit (URL Rewriting)");

        out.println("</a>");


        // HTTP SESSION

        out.println("<h3>3. HttpSession Demo</h3>");

        out.println("<a href='SessionServlet'>");

        out.println("Visit (HttpSession)");

        out.println("</a>");


        out.println("</div>");

        out.println("</body>");

        out.println("</html>");
    }
}