package com.ShopNest.coustomer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ShopNest.dbhandler.DataInjector;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("uname");
		String mail=req.getParameter("mail");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		
		String status = DataInjector.addCustomer(uname,mail,pass,gender,address);
		
		if(uname.length()==0 || pass.length()==0)
		{
		res.sendRedirect("register.jsp");

		}
		else
		{
			res.sendRedirect("login.jsp");
		
		}


	}
	

}
