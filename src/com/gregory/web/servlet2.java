package com.gregory.web;
import models.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String catName;
    int catWeight;
    String catBreed;
    cats MyCat;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("catName", catName);
		request.setAttribute("catBreed", catBreed);
		request.setAttribute("catWeight", catWeight);
		request.setAttribute("MyCat", MyCat);
		
		if (this.catName != null) {
			this.MyCat = new cats(catName, catBreed, catWeight);
			request.getRequestDispatcher("/WEB-INF/views/newCat.jsp").forward(request, response);
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
      this.catName = request.getParameter("catName");
      if(request.getParameter("catWeight") == null) {
			
			this.catWeight = 1;
		}else {
			String catw = request.getParameter("catWeight");
			this.catWeight = Integer.parseInt(catw);
		}
      
      this.catBreed = request.getParameter("catBreed");
		doGet(request, response);
	}

}
