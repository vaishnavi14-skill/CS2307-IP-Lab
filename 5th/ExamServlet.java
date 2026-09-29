package com.WebApplication2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExamServlet")
public class ExamServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Get student details
        String username = request.getParameter("username");
        String rollno = request.getParameter("rollno");
        String regno = request.getParameter("regno");
        String email = request.getParameter("email");

        // Get answers
        String q1 = request.getParameter("q1");
        String q2 = request.getParameter("q2");
        String q3 = request.getParameter("q3");
        String q4 = request.getParameter("q4");
        String q5 = request.getParameter("q5");
        String q6 = request.getParameter("q6");
        String q7 = request.getParameter("q7");
        String q8 = request.getParameter("q8");
        String q9 = request.getParameter("q9");
        String q10 = request.getParameter("q10");

        // Initial score
        int score = 0;

        // Correct answers
        String ans1 = "Hyper Text Markup Language";
        String ans2 = "a";
        String ans3 = "CSS";
        String ans4 = "img";
        String ans5 = "#";
        String ans6 = "JavaScript";
        String ans7 = "POST";
        String ans8 = "p";
        String ans9 = "HTTP";
        String ans10 = "tr";

        // Check answers
        if (ans1.equals(q1))
            score++;

        if (ans2.equals(q2))
            score++;

        if (ans3.equals(q3))
            score++;

        if (ans4.equals(q4))
            score++;

        if (ans5.equals(q5))
            score++;

        if (ans6.equals(q6))
            score++;

        if (ans7.equals(q7))
            score++;

        if (ans8.equals(q8))
            score++;

        if (q9 != null &&
                q9.trim().equalsIgnoreCase(ans9))
            score++;

        if (q10 != null &&
                q10.trim().equalsIgnoreCase(ans10))
            score++;


        // Response
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");

        out.println("<title>Quiz Result</title>");

        out.println("<style>");

        out.println("body {");
        out.println("font-family: Arial, sans-serif;");
        out.println("background: linear-gradient(135deg, #eff6ff, #f5f3ff);");
        out.println("margin: 0;");
        out.println("padding: 40px 15px;");
        out.println("}");

        out.println(".result {");
        out.println("width: 650px;");
        out.println("max-width: 100%;");
        out.println("margin: auto;");
        out.println("background: white;");
        out.println("padding: 30px;");
        out.println("border-radius: 15px;");
        out.println("box-shadow: 0 10px 30px rgba(0,0,0,0.15);");
        out.println("}");

        out.println("h1 {");
        out.println("text-align: center;");
        out.println("color: #172554;");
        out.println("}");

        out.println(".student {");
        out.println("background: #eff6ff;");
        out.println("padding: 15px;");
        out.println("border-radius: 8px;");
        out.println("margin-bottom: 20px;");
        out.println("}");

        out.println(".student p {");
        out.println("margin: 7px 0;");
        out.println("color: #334155;");
        out.println("}");

        out.println(".score {");
        out.println("text-align: center;");
        out.println("font-size: 28px;");
        out.println("font-weight: bold;");
        out.println("color: #2563eb;");
        out.println("padding: 15px;");
        out.println("background: #eff6ff;");
        out.println("border-radius: 10px;");
        out.println("margin-bottom: 25px;");
        out.println("}");

        out.println(".answers {");
        out.println("background: #f8fafc;");
        out.println("padding: 20px;");
        out.println("border-radius: 10px;");
        out.println("}");

        out.println(".answers h2 {");
        out.println("color: #172554;");
        out.println("margin-top: 0;");
        out.println("}");

        out.println(".answer {");
        out.println("padding: 10px;");
        out.println("margin: 8px 0;");
        out.println("background: white;");
        out.println("border-left: 4px solid #2563eb;");
        out.println("border-radius: 5px;");
        out.println("color: #334155;");
        out.println("}");

        out.println(".home {");
        out.println("display: block;");
        out.println("width: fit-content;");
        out.println("margin: 25px auto 0;");
        out.println("padding: 12px 25px;");
        out.println("background: #2563eb;");
        out.println("color: white;");
        out.println("text-decoration: none;");
        out.println("border-radius: 7px;");
        out.println("}");

        out.println("</style>");

        out.println("</head>");


        out.println("<body>");

        out.println("<div class='result'>");

        out.println("<h1>Quiz Result</h1>");


        // Student details
        out.println("<div class='student'>");

        out.println("<p><b>Name:</b> "
                + username + "</p>");

        out.println("<p><b>Roll Number:</b> "
                + rollno + "</p>");

        out.println("<p><b>Register Number:</b> "
                + regno + "</p>");

        out.println("<p><b>Email:</b> "
                + email + "</p>");

        out.println("</div>");


        // Score
        out.println("<div class='score'>");

        out.println("Score: "
                + score + " / 10");

        out.println("</div>");


        // Correct answers
        out.println("<div class='answers'>");

        out.println("<h2>Correct Answers</h2>");


        out.println("<div class='answer'>");
        out.println("<b>1.</b> "
                + ans1);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>2.</b> "
                + ans2);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>3.</b> "
                + ans3);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>4.</b> "
                + ans4);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>5.</b> "
                + ans5);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>6.</b> "
                + ans6);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>7.</b> "
                + ans7);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>8.</b> "
                + ans8);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>9.</b> "
                + ans9);
        out.println("</div>");


        out.println("<div class='answer'>");
        out.println("<b>10.</b> "
                + ans10);
        out.println("</div>");


        out.println("</div>");


        // Back to home
        out.println("<a class='home' href='index.html'>");
        out.println("Back to Home");
        out.println("</a>");


        out.println("</div>");

        out.println("</body>");

        out.println("</html>");
    }
}