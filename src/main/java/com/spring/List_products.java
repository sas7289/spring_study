package com.spring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "product_list", urlPatterns = "/products")
public class List_products extends HttpServlet {
    ArrayList<Product> products = new ArrayList<>(10);

    @Override
    public void init() throws ServletException {
        products = new ArrayList<>(10);
        products.add(new Product(0, "Bread", 50));
        products.add(new Product(0, "Water", 45));
        products.add(new Product(0, "Meet", 450));
        products.add(new Product(0, "Chicken", 235));
        products.add(new Product(0, "Lemon", 134));
        products.add(new Product(0, "Sausage", 970));
        products.add(new Product(0, "Beer", 65));
        products.add(new Product(0, "Sugar", 61));
        products.add(new Product(0, "Orange", 237));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        for (Product product : products) {
            resp.getWriter().println(product.getTitle() + "<br>");
        }
    }
}
