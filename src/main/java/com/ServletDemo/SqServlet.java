//package com.ServletDemo;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class SqServlet extends HttpServlet {
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
////		PrintWriter out = res.getWriter();
////		out.println("Hello sq");
//		// getting the value from AddServlet
//		int k = (int) req.getAttribute("k");
//		k = k*k;
//		PrintWriter out = res.getWriter();
//		out.println("result is "+k);
//	}
//}

// send redirect

//package com.ServletDemo;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class SqServlet extends HttpServlet {
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int k = Integer.parseInt(req.getParameter("k"));
//		k = k*k;
//		PrintWriter out = res.getWriter();
//		out.println("Result :"+ k);
//		System.out.println("Sq is called");
//	}
//}

// session 
//package com.ServletDemo;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//public class SqServlet extends HttpServlet{
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
//		k = k*k;
//		PrintWriter out = res.getWriter();
//		out.print("result = "+k);
//	}
//}

// cookie
package com.ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c :  cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("result = "+k);
	}
}
