package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDAO;
import dept.DeptDTO;

/**
 * Servlet implementation class DeptServlet
 */
@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr;");
		PrintWriter pw = response.getWriter();
	
		//1. ������ �����ϱ� -request����
		DeptDTO dept = new DeptDTO("001","�����","","","");
		request.setAttribute("mydata", dept);
		System.out.println("sendRedirectServlet ����Ϸ�");
		
		//2. ��û������ - sendRedirect
		response.sendRedirect("/server_web/jspbasic/subPage.jsp");
	}

}