package mockitojunittest;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import crudoperation.CrudServlet;
import crudoperation.UserInfo;
@RunWith(MockitoJUnitRunner.class)
public class JunitTester {

	
	@Test
	public void test() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        HttpSession session = mock(HttpSession.class);
        ArrayList<UserInfo> al=new ArrayList<UserInfo>();
        when(request.getParameter("Address")).thenReturn("Bangalore");
        when(request.getParameter("button1")).thenReturn("button1");
       // PrintWriter writer = new PrintWriter("somefile.txt");
        //when(response.getWriter()).thenReturn(writer);
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute(anyString())).thenReturn(al);
        when(request.getRequestDispatcher(anyString())).thenReturn(dispatcher);
       // when(dispatcher.forward(request, response)).thenReturn("success");

        new CrudServlet().doPost(request, response);

        verify(request, atLeast(1)).getParameter("Address"); 
        //writer.flush(); // it may not have been flushed yet...
        //assertTrue(FileUtils.readFileToString(new File("somefile.txt"), "UTF-8")
           //        .contains("My Expected String"));
        //assertTrue(stringWriter.toString().contains("My Expected String"));
    }

}
