package crudoperation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	
	public void init() throws ServletException{
		super.init();
		System.out.println("..........................TEST..........");
		
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	
		if(request.getParameter("button1") != null)
			
		{
			ArrayList<UserInfo> al1=(ArrayList<UserInfo>) request.getSession().getAttribute("store");
			if(al1 == null)
			{
				ArrayList<UserInfo> al=new ArrayList<UserInfo>();
				
				UserInfo ui=new UserInfo();
				ui.setAddress(request.getParameter("Address"));
				ui.setAge(request.getParameter("Age"));
				ui.setDob(request.getParameter("Address"));
				ui.setDoj(request.getParameter("DOJ"));
                ui.setName(request.getParameter("uname"));	
                ui.setTechnology(request.getParameter("Technology"));
			
			al.add(ui);
			request.getSession().setAttribute("store",al);
			}
			
			else
				
			{
				UserInfo ui=new UserInfo();
				ui.setAddress(request.getParameter("Address"));
				ui.setAge(request.getParameter("Age"));
				ui.setDob(request.getParameter("Address"));
				ui.setDoj(request.getParameter("DOJ"));
                ui.setName(request.getParameter("uname"));	
                ui.setTechnology(request.getParameter("Technology"));
			
			al1.add(ui);
			request.getSession().setAttribute("store",al1);
				
			}
			
			
			}else if(request.getParameter("button3")!= null){
				
				ArrayList<UserInfo> al1=(ArrayList<UserInfo>) request.getSession().getAttribute("store");
				al1.remove(0);
				request.getSession().setAttribute("store",al1);
				
			}else {
				
			}
			request.getRequestDispatcher("/WEB-INF/LoginForm.jsp").forward(request, response);
		}
		
		
	}
	
	
	
	

