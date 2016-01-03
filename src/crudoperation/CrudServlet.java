package crudoperation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CrudServlet extends HttpServlet {
	
	public void init() throws ServletException{
		super.init();
		System.out.println("..........................TEST..........");
		
	}

	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	
		if(request.getParameter("button1") != null)
			
		{
			ArrayList<UserInfo> al1=(ArrayList<UserInfo>) request.getSession().getAttribute("store");
			if(al1 == null)
			{
				ArrayList<UserInfo> al=new ArrayList<UserInfo>();
				
				UserInfo ui=new UserInfo();
				ui.setAddress(request.getParameter("Address"));
				ui.setAge(request.getParameter("Age"));
				ui.setDob(request.getParameter("DOB"));
				ui.setDoj(request.getParameter("DOJ"));
                ui.setName(request.getParameter("uname"));	
                ui.setTechnology(request.getParameter("Technology"));
			
			al.add(ui);
			request.getSession().setAttribute("store",al);
			request.getSession().setAttribute("store1",null);
			}
			
			else
				
			{
				UserInfo ui=new UserInfo();
				ui.setAddress(request.getParameter("Address"));
				ui.setAge(request.getParameter("Age"));
				ui.setDob(request.getParameter("DOB"));
				ui.setDoj(request.getParameter("DOJ"));
                ui.setName(request.getParameter("uname"));	
                ui.setTechnology(request.getParameter("Technology"));
			
			al1.add(ui);
			request.getSession().setAttribute("store",al1);
			request.getSession().setAttribute("store1",null);	
			}
			
			
			}else if(request.getParameter("button3")!= null){
				
				
				
				ArrayList<UserInfo> al1=(ArrayList<UserInfo>) request.getSession().getAttribute("store");
				if(al1 != null)
				{al1.remove(0);
				request.getSession().setAttribute("store",al1);
				}
				else
					System.out.println("Nothing to Delete");
			}
else if(request.getParameter("button4")!= null){
				
				
				
				ArrayList<UserInfo> al1=(ArrayList<UserInfo>) request.getSession().getAttribute("store");
				
				String uname=request.getParameter("Age1");
				System.out.println(uname);
				
				al1=(ArrayList<UserInfo>) al1.stream().filter(u -> u.getName().equals(uname)).collect(Collectors.toList());
				request.getSession().setAttribute("store1",al1);
			}
			else {
				
			}
			request.getRequestDispatcher("/WEB-INF/LoginForm.jsp").forward(request, response);
		}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			 throws ServletException,IOException {
		doPost(req, res);
	}
		
	}
	
	
	
	

