package com.shopping.dao;

import com.shopping.model.Order;
import com.shopping.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

    // INSERT ORDER
    public boolean addOrder(Order order) {

        String sql =
            "INSERT INTO orders "
            + "(customer_name, phone, email, product_name, quantity, "
            + "price, total_amount, district) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, order.getCustomerName());
            ps.setString(2, order.getPhone());
            ps.setString(3, order.getEmail());
            ps.setString(4, order.getProductName());
            ps.setInt(5, order.getQuantity());
            ps.setBigDecimal(6, order.getPrice());
            ps.setBigDecimal(7, order.getTotalAmount());
            ps.setString(8, order.getDistrict());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();

            return false;
        }
    }


    // GET ALL ORDERS
    public List<Order> getAllOrders() {

        List<Order> orderList = new ArrayList<>();

        String sql =
            "SELECT * FROM orders ORDER BY order_id DESC";

        try (
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)
        ) {

            while (rs.next()) {

                Order order = new Order();

                order.setOrderId(
                    rs.getInt("order_id")
                );

                order.setCustomerName(
                    rs.getString("customer_name")
                );

                order.setPhone(
                    rs.getString("phone")
                );

                order.setEmail(
                    rs.getString("email")
                );

                order.setProductName(
                    rs.getString("product_name")
                );

                order.setQuantity(
                    rs.getInt("quantity")
                );

                order.setPrice(
                    rs.getBigDecimal("price")
                );

                order.setTotalAmount(
                    rs.getBigDecimal("total_amount")
                );

                order.setDistrict(
                    rs.getString("district")
                );

                order.setOrderDate(
                    rs.getTimestamp("order_date")
                );

                orderList.add(order);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return orderList;
    }
}