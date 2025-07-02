package com.xworkz.accountdetails.servlets;

import com.xworkz.accountdetails.dto.AccountDetailsDto;
import com.xworkz.accountdetails.service.AccountDetailsService;
import com.xworkz.accountdetails.service.impl.AccountDetailsServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")

public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet enter\n");
        boolean isValidatedAndSaved = false;
        String givenName = req.getParameter("givenName");
        String surName = req.getParameter("surName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String cnfPassword = req.getParameter("cnfPassword");

        AccountDetailsDto dto = new AccountDetailsDto();

        dto.setGivenName(givenName);
        dto.setSurName(surName);
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setCnfPassword(cnfPassword);

        AccountDetailsService service = new AccountDetailsServiceImp();
        isValidatedAndSaved = service.validateAndSave(dto);

        if (isValidatedAndSaved) {
            PrintWriter message = resp.getWriter();
            message.write("Thank You," + givenName);

            System.out.println("servlet exit\n");
        }
    }
}

