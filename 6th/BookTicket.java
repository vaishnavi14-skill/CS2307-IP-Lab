package com.TicketBookingSystem;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/BookingServlet")
public class BookTicket extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ticketdb" + "?useSSL=false" + "&allowPublicKeyRetrieval=true" + "&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mmnvs./";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("movie.html");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("userName");
        String mobile = request.getParameter("mobile");
        String movie = request.getParameter("movieName");
        String showTime = request.getParameter("showTime");
        String numberText = request.getParameter("numTickets");
        String paymentMethod = request.getParameter("paymentMethod");
        String[] selectedSeats = request.getParameterValues("seats");
        int numberOfSeats = 0;
        String seats = "";
        if (selectedSeats != null) {
            numberOfSeats = selectedSeats.length;
            seats = String.join(", ", selectedSeats);
        }
        String[] snacksArray = request.getParameterValues("snacks");
        String snacks = "None";
        if (snacksArray != null) {
            snacks = String.join(", ", snacksArray);
        }
        Connection con = null;
        PreparedStatement ps = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String sql = "INSERT INTO movie_bookings " + "(name, mobile, movie, seats, " + "number_of_seats, show_time, " + "snacks, payment_method) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, mobile);
            ps.setString(3, movie);
            ps.setString(4, seats);
            ps.setInt(5, numberOfSeats);
            ps.setString(6, showTime);
            ps.setString(7, snacks);
            ps.setString(8, paymentMethod);
            int result = ps.executeUpdate();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Booking Confirmation</title>");
            out.println("<style>");
            out.println("body {" + "font-family:Arial;" + "background:#fdebd0;" + "text-align:center;" + "padding:30px;" + "}");
            out.println("h1 {color:darkred;}");
            out.println("h2 {color:#6a1b9a;}");
            out.println("table {" + "margin:20px auto;" + "border-collapse:collapse;" + "background:white;" + "box-shadow:0px 5px 15px #999;" + "}");
            out.println("th {" + "background:#e91e63;" + "color:white;" + "padding:12px;" + "}");
            out.println("td {" + "border:1px solid #777;" + "padding:12px 18px;" + "}");
            out.println("td:first-child {" + "font-weight:bold;" + "background:#fce4ec;" + "}");
            out.println("a {" + "text-decoration:none;" + "background:#2196f3;" + "color:white;" + "padding:10px 20px;" + "border-radius:20px;" + "}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            if (result > 0) {
                out.println("<h1>" + "Ticket Booked Successfully!" + "</h1>");
                out.println("<h2>Booking Details</h2>");
                out.println("<table>");
                out.println("<tr>");
                out.println("<th>Details</th>");
                out.println("<th>Information</th>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Name</td>");
                out.println("<td>" + name + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Mobile Number</td>");
                out.println("<td>" + mobile + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Movie</td>");
                out.println("<td>" + movie + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Selected Seats</td>");
                out.println("<td>" + seats + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Number of Seats</td>");
                out.println("<td>" + numberOfSeats + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Show Time</td>");
                out.println("<td>" + showTime + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Snacks</td>");
                out.println("<td>" + snacks + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Payment Method</td>");
                out.println("<td>" + paymentMethod + "</td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<h2>All Booking Details</h2>");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * " + "FROM movie_bookings " + "ORDER BY booking_id DESC");
                out.println("<table>");
                out.println("<tr>");
                out.println("<th>Booking ID</th>");
                out.println("<th>Name</th>");
                out.println("<th>Mobile</th>");
                out.println("<th>Movie</th>");
                out.println("<th>Seats</th>");
                out.println("<th>Number of Seats</th>");
                out.println("<th>Show Time</th>");
                out.println("<th>Snacks</th>");
                out.println("<th>Payment</th>");
                out.println("<th>Booking Date</th>");
                out.println("</tr>");
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>");
                    out.println(rs.getInt("booking_id"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("name"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("mobile"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("movie"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("seats"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getInt("number_of_seats"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("show_time"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("snacks"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("payment_method"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getTimestamp("booking_date"));
                    out.println("</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } else {
                out.println("<h2>" + "Booking Failed" + "</h2>");
            }
            out.println("<br><br>");
            out.println("<a href='movie.html'>" + "Book Another Ticket" + "</a>");
            out.println("</body>");
            out.println("</html>");
        }
        catch (ClassNotFoundException e) {
            out.println("<h2>MySQL Driver Not Found</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
        }
        catch (Exception e) {
            out.println("<h2>Database Error</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            }
            catch (Exception e) {
                // Ignore closing errors
            }
            out.close();
        }
    }
}