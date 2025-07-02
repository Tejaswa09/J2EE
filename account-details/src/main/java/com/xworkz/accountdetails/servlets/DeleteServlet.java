package com.xworkz.accountdetails.servlets;

import com.xworkz.accountdetails.service.AccountDetailsService;
import com.xworkz.accountdetails.service.impl.AccountDetailsServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String givenName = req.getParameter("givenName");

        AccountDetailsService accountDetailsService = new AccountDetailsServiceImp();
        accountDetailsService.validateAndDelete(givenName);
    }
}
