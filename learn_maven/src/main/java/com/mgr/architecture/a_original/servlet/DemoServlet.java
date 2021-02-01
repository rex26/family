package com.mgr.architecture.a_original.servlet;

import com.mgr.architecture.a_original.service.DemoService;
import com.mgr.architecture.a_original.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author helios
 */
@WebServlet(urlPatterns = "/test")
public class DemoServlet extends HttpServlet {
    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll());
    }
}
