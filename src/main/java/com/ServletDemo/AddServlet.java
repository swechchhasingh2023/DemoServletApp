//package com.ServletDemo;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class AddServlet extends HttpServlet {
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
////		System.out.println("result is " +k);
//		PrintWriter out = res.getWriter();
//		out.println("result is " +k);
//	}
//}

//Get Or post
//package com.ServletDemo;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class AddServlet extends HttpServlet{
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i +j;
////		System.out.println(k);
//		PrintWriter out = res.getWriter();
//		out.println("result is " +k);
//	}
//}

//package com.ServletDemo;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class AddServlet extends HttpServlet{
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		PrintWriter out = res.getWriter();
//		out.println("result "+k);
//	}
//	public void doGet(HttpServletRequest req, HttpServlet res) {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		PrintWriter out = res.getWriter();
//		out.println("result "+k);
//	}
//}


//RequestDispatcher 
//package com.ServletDemo;
//
//import java.io.IOException;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//
//
//public class AddServlet extends HttpServlet {
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		// if you want to pass the data
//		req.setAttribute("k", k);
//		// request dispatcher & redirect
//		// request dispatcher  - 
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//	}
//}


// send redirect

//package com.ServletDemo;
//
//import java.io.IOException;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//
//
//public class AddServlet extends HttpServlet {
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
////		res.sendRedirect("sq");
//		res.sendRedirect("sq?k="+k); //url Rewriting
//	}
//}

// session
//package com.ServletDemo;
//
//import java.io.IOException;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//public class AddServlet extends HttpServlet{
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
//	}
//}

// Cookie
package com.ServletDemo;
import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}
