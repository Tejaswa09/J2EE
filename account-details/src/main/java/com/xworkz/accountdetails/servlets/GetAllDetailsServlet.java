package com.xworkz.accountdetails.servlets;

import com.xworkz.accountdetails.dto.AccountDetailsDto;
import com.xworkz.accountdetails.service.AccountDetailsService;
import com.xworkz.accountdetails.service.impl.AccountDetailsServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getDetails")
public class GetAllDetailsServlet extends HttpServlet {
    AccountDetailsService service;
    public GetAllDetailsServlet(){
        service = new AccountDetailsServiceImp();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountDetailsDto[] dtos = service.getAllUser();
        System.out.println("enters sevlet");
        for(AccountDetailsDto dto:dtos){
            System.out.println(dto);
        }
        req.setAttribute("listOfUsers",dtos);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("GetAllDetails.jsp");//servlet chaining
        requestDispatcher.forward(req,resp);
        System.out.println("exit servlet");
    }
}
