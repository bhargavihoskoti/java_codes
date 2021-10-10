package com.example.training;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/book")
public class FindBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FindBookServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getClass().getName());
		System.out.println(response.getClass().getName());
		
		String memberName=request.getParameter("memberName");
		
		MemberService service =new MemberService();
		
		List<Member> books=service.findByMember(memberName);
		
		request.setAttribute("foundBook", books);
		
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("book_details.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
