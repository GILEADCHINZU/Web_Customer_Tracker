package com.chinzu.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Set up the connection variables
		
		String userid = "chinzu";
		String password = "gilead5050";
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		// connect to the database
		
		try{
			
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to " + jdbcUrl);
			
			Class.forName(driver);
			
		   Connection conn = DriverManager.getConnection(jdbcUrl, userid, password);
		   
		   out.println("<br>");
		   out.println("SUCEESS!!!");
		   
		   conn.close();
		   
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
