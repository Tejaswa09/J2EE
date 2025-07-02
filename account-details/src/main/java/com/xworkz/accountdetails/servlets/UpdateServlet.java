package com.xworkz.accountdetails.servlets;

import com.xworkz.accountdetails.service.AccountDetailsService;
import com.xworkz.accountdetails.service.impl.AccountDetailsServiceImp;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           System.out.println("enters the servletUpdate\n");
        String givenName=req.getParameter("givenName");
        String email = req.getParameter("email");

        AccountDetailsService accountDetailsService = new AccountDetailsServiceImp();
        accountDetailsService.validateAndUpdateEmailByName(givenName,email);
        System.out.println("Exit servlet\n");
    }
}
