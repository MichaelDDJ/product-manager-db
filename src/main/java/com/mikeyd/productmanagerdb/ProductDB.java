package com.mikeyd.productmanagerdb;

import org.jetbrains.annotations.NotNull;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductDB {

    Connection conn = null;
    List<Product> products = new ArrayList<>();



    public ProductDB () {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/productsdb", "postgres", "132465p");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(@NotNull Product p) {
        String query = "insert into products (name, type, place, year_acquired) values (?,?,?,?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p.getName());
            stmt.setString(2, p.getType());
            stmt.setString(3, p.getPlace());
            stmt.setInt(4, p.getYear_acquired());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Product getProductByName(String n) {

        String query = "select name,type,place,year_acquired from products where name = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, n);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                String type = rs.getString("type");
                String place = rs.getString("place");
                int year_acquired = rs.getInt("year_acquired");
                Product product = new Product(name, type, place, year_acquired);
                return product;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAll(){

        String query = "select name,type,place,year_acquired from products";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String type = rs.getString("type");
                String place = rs.getString("place");
                int year_acquired = rs.getInt("year_acquired");
                Product product = new Product(name, type, place, year_acquired);
                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    public void delete(Product p) {
        String query = "delete from products where name = ? and type = ? and place = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p.getName());
            stmt.setString(2, p.getType());
            stmt.setString(3, p.getPlace());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct (Product p, String key, String value) {
        String query = "update products set name = ?, type = ?, place = ? where name = ? and type = ? and place = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, key.equals("name") ? value : p.getName());
            stmt.setString(2, key.equals("type") ? value : p.getType());
            stmt.setString(3, key.equals("place") ? value : p.getPlace());
            stmt.setString(4, p.getName());
            stmt.setString(5, p.getType());
            stmt.setString(6, p.getPlace());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
