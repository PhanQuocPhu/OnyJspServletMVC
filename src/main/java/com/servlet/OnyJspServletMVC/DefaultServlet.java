package com.servlet.OnyJspServletMVC;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DefaultServlet", value = "")
public class DefaultServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.sendRedirect("/onlyjsp");
    }

    public void destroy() {
    }
}