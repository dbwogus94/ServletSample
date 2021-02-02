package servletTest;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import util.ServletUtil;

public class MyFirstServlet_Servlet implements Servlet {
	
	public MyFirstServlet_Servlet() {
		System.out.println();
		System.out.println("servletTest.MyFirstServlet_Servlet :");
		System.out.println("======================[Constructor]======================");
		System.out.println("interface Servlet을 구현한 class MyFirstServlet_Servlet 생성");
	}
	
	/* Life Cycle 관련 메소드 */
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyFirstServlet_Servlet.class.getName(), "init");
	}
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyFirstServlet_Servlet.class.getName(), "service");
		request.getServletContext().setAttribute("this Servlet Class Name", MyFirstServlet_Servlet.class.getSimpleName());
		ServletUtil.printWriteHtml(request, response);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyFirstServlet_Servlet.class.getName(), "destroy");
	}

	/* 보조 메서드 */
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyFirstServlet_Servlet.class.getName(), "ServletConfig");
		return null;
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyFirstServlet_Servlet.class.getName(), "getServletInfo");
		return null;
	}
}
