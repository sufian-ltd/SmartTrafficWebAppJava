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

import com.traffic.web.admin.beans.Document;
import com.traffic.web.admin.beans.User;
import com.traffic.web.admin.dao.AdminDao;

/**
 * Servlet implementation class AcceptRequestServlet
 */
@WebServlet("/AcceptRequestServlet")
public class AcceptRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcceptRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		AdminDao dao=new AdminDao();
		try {
			User user=dao.getUserDocumentById(id);
			boolean yes=dao.isValidDocument(user);
			String msg="";
			if(yes) {
				msg="It's a valid NID,Driving License and Vehicle License";
				dao.acceptRequest(id);
			}
			else {
				msg="This user entered wrong NID or Driving License or Vehicle License";
			}
			request.setAttribute("msg", msg);
			List<User> list = dao.getPendingRequest();
			request.setAttribute("REQUEST_LIST", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("view-pending-request.jsp");
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
