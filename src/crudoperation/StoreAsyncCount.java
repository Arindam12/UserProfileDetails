package crudoperation;


import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StoreAsyncCount extends HttpServlet {

	/**
	 * A simple HelloWorld Servlet
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws java.io.IOException {
		res.setContentType("text/html");
		ArrayList<UserInfo> al2=(ArrayList<UserInfo>) req.getSession().getAttribute("store");
		
		/*if(al2 != null)
		{
			al2.remove(0);
		req.getSession().setAttribute("store",al2);
		}
		else*
			System.out.println("Nothing to Delete");*/
		res.getWriter().write("Profile Count From the Store ::"+al2.size());

	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws java.io.IOException {
		doPost(req, res);
	}
}