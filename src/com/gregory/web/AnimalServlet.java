package com.gregory.web;
import models.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnimalServlet
 */


@WebServlet("/AnimalServlet")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String dogName;
    int dogWeight;
    String dogBreed;
    String catName;
    int catWeight;
    String catBreed;
    String type;
    dogs MyDog;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("dogName", dogName);
		request.setAttribute("dogBreed", dogBreed);
		request.setAttribute("dogWeight", dogWeight);
//		
		request.setAttribute("type", type);
		request.setAttribute("MyDog", MyDog);
		
//		
		if (this.dogName != null) {
			this.MyDog = new dogs(dogName, dogBreed, dogWeight);
			request.getRequestDispatcher("/WEB-INF/views/newDog.jsp").forward(request, response);
		    
		}
//		if (this.type == "cat") {
//			new cats(catName, catBreed, catWeight);
//			request.getRequestDispatcher("/WEB-INF/views/newCat.jsp").forward(request, response);
//		}
		
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/animals.jsp");
	    view.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		this.dogName = request.getParameter("dogName");
		
		if(request.getParameter("dogWeight") == null) {
			
			this.dogWeight = 1;
		}else {
			String dogw = request.getParameter("dogWeight");
			this.dogWeight = Integer.parseInt(dogw);
		}
		
		this.dogBreed = request.getParameter("dogBreed");
		
		
		
		
               
//        this.catName = request.getParameter("catName");
//        String catw = request.getParameter("catWeight");
//        this.catWeight = Integer.parseInt(catw);
//        this.catBreed = request.getParameter("catBreed");
        this.type = request.getParameter("cord");
        this.type = request.getParameter("cord2");
        
        
		doGet(request, response);
	}

}
