package com.xworkz.pass.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class PassPortServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname=req.getParameter("firstname");
        String lastname=req.getParameter("lastname");
        String date=req.getParameter("date");
        String phonenumber=req.getParameter("number");
        String Adharno=req.getParameter("Adharno");
        String passportoffice=req.getParameter("passportoffice");
        String email=req.getParameter("email");
        String loginid=req.getParameter("loginid");
        String password=req.getParameter("password");
        String confirmpassword=req.getParameter("confirm");


        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(date);
        System.out.println(phonenumber);
        System.out.println(Adharno);
        System.out.println(passportoffice);
        System.out.println(email);
        System.out.println(loginid);
        System.out.println(password);
        System.out.println(confirmpassword);
    }
}
