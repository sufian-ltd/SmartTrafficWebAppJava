package com.traffic.web.admin.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.traffic.web.admin.beans.User;
import com.traffic.web.admin.dao.AdminDao;

/**
 * Servlet implementation class ViewPunishedUserServlet
 */
@WebServlet("/ViewPunishedUserServlet")
public class ViewPunishedUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewPunishedUserServlet() {
        super();
        // TODO Auto-generated constructor stub
        dao=new AdminDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<User> list = dao.getPunishedUser();
			request.setAttribute("PUNISHED_LIST", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("view-punished-user.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
