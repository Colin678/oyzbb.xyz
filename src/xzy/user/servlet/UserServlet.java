package xzy.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Uservlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid =Integer.parseInt(request.getParameter("userid"));
		String cpwd=request.getParameter("userpwd");
		if((cid==1020084984)&&cpwd.equals("qq1020084984")) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	}

}
