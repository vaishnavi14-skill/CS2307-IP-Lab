package com.shopping.controller;

import com.shopping.dao.OrderDAO;
import com.shopping.model.Order;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddOrderServlet")
public class AddOrderServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            String customerName =
                    request.getParameter("customerName");

            String phone =
                    request.getParameter("phone");

            String email =
                    request.getParameter("email");

            String productName =
                    request.getParameter("productName");

            int quantity =
                    Integer.parseInt(
                            request.getParameter("quantity")
                    );

            BigDecimal price =
                    new BigDecimal(
                            request.getParameter("price")
                    );

            BigDecimal totalAmount =
                    price.multiply(
                            BigDecimal.valueOf(quantity)
                    );

            String district =
                    request.getParameter("district");


            Order order = new Order(

                    customerName,
                    phone,
                    email,
                    productName,
                    quantity,
                    price,
                    totalAmount,
                    district
            );


            OrderDAO dao = new OrderDAO();

            boolean success =
                    dao.addOrder(order);


            if (success) {

                response.sendRedirect(
                        "viewOrders.jsp?status=success"
                );

            } else {

                response.sendRedirect(
                        "orderForm.jsp?status=failed"
                );
            }

        } catch (Exception e) {

            e.printStackTrace();

            response.sendRedirect(
                    "orderForm.jsp?status=error"
            );
        }
    }
}