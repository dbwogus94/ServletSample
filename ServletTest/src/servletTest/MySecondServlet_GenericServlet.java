package servletTest;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import util.ServletUtil;

public class MySecondServlet_GenericServlet extends GenericServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MySecondServlet_GenericServlet() {
		System.out.println();
		System.out.println("servletTest.MySecondServlet_GenericServlet :");
		System.out.println("======================[Constructor]======================");
		System.out.println("추상 클래스 GenericServlet를 상속한 class MySecondServlet_GenericServlet 생성");
	}
	
	/* Life Cycle 관련 메소드*/
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletUtil.printMethod(MySecondServlet_GenericServlet.class.getName(), "init");
		super.init(config);
	}
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MySecondServlet_GenericServlet.class.getName(), "service");
		request.getServletContext().setAttribute("this Servlet Class Name", MySecondServlet_GenericServlet.class.getName());
		ServletUtil.printWriteHtml(request, response);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MySecondServlet_GenericServlet.class.getName(), "destroy");
		super.destroy();
	}
	/* 보조 메서드 */
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MySecondServlet_GenericServlet.class.getName(), "ServletConfig");
		return super.getServletConfig();
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MySecondServlet_GenericServlet.class.getName(), "getServletInfo");
		return super.getServletInfo();
	}

}
