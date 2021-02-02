package servletTest;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ServletUtil;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/servlet")
public class MyThirdServlet_HttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	/**
     * @see HttpServlet#HttpServlet()
     */
    public MyThirdServlet_HttpServlet() {
    	super();
    	System.out.println();
    	System.out.println("servletTest.MyThirdServlet_HttpServlet :");
    	System.out.println("======================[Constructor]======================");
    	System.out.println("추상 클래스 HttpServlet을 상속한 class MyThirdServlet_HttpServlet 생성");
    }
	
    /*================================== interface Servlet의 추상 메서드 ==================================*/
    @Override
    public void init(ServletConfig config) throws ServletException {
    	ServletUtil.printMethod(MyThirdServlet_HttpServlet.class.getName(), "init");
    	super.init(config);
    }
    
    @Override
	public void destroy() {
		// TODO Auto-generated method stub
    	ServletUtil.printMethod(MyThirdServlet_HttpServlet.class.getName(), "destroy");
		super.destroy();
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyThirdServlet_HttpServlet.class.getName(), "service");
		request.getServletContext().setAttribute("this Servlet Class Name", MyThirdServlet_HttpServlet.class.getName());
		super.service(request, response);	// super.service(req, res)를 호출하지 않으면 
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyThirdServlet_HttpServlet.class.getName(), "getServletConfig");
		return super.getServletConfig();
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		ServletUtil.printMethod(MyThirdServlet_HttpServlet.class.getName(), "getServletContext");
		return super.getServletContext();
	}
	/*================================== interface Servlet의 추상 메서드 ==================================*/

	
	/*================================== class HttpServlet의 메서드  시작 ===================================*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("servletTest.MyThirdServlet_HttpServlet : [doGet] - /third get방식 요청");
		System.out.println("servletTest.MyThirdServlet_HttpServlet : [QueryString] - " + request.getQueryString());
		System.out.println("servletTest.MyThirdServlet_HttpServlet : [encoding] - " + request.getCharacterEncoding());
		ServletUtil.printWriteHtml(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	/*================================== class HttpServlet의 메서드  끝 ===================================*/
	
}
