package com.rex.ioc.servlet;

import com.rex.ioc.service.DemoService;
import com.rex.ioc.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo1")
public class DemoServlet1 extends HttpServlet {

    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println(demoService.findAll().toString());
    }

}
