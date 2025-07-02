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

@WebServlet("/getDetailsByName")
public class GetDetailsByNameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountDetailsDto returnedvalue = new AccountDetailsDto();

        String givenName = req.getParameter("givenName");

        AccountDetailsService service =new AccountDetailsServiceImp();

        returnedvalue=service.detailsReturned(givenName);
        System.out.println("dto in servlet"+returnedvalue);
        PrintWriter output = resp.getWriter();
        if(returnedvalue != null){
            output.write(String.valueOf(returnedvalue));
        }


    }
}
