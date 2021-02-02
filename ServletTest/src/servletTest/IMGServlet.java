package servletTest;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



/**
 * serlvet 바이너리 코드응답 
 * @author 1994d
 *
 */
@WebServlet("/imgServlet")
public class IMGServlet extends GenericServlet {			// 
	private static final long serialVersionUID = 1L;

	  @Override
	  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

	    /* 바이너리 데이터를 response하기 위해 먼저 내보낼 파일의 경로를 알아내야 한다.*/
		  
	    /* 1. 서블릿의 환경 정보를 다루는 객체를 먼저 얻는다. */ 
	     ServletContext serlvetContext = req.getServletContext();
	     
	    /*
	     * 2. ServletContext를 통해 웹 자원의 실제 경로를 알아낸다.	
	     * 
	     * 	웹 앱(tomcat)이 바라보는 실제 경로(절대경로): resource
	     * 		C:\workspaces\worksqace_refactoring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\ServletTest
	     * 	웹 앱에 매핑되는 프로젝트 경로 :  
	     * 		C:\workspaces\worksqace_refactoring\ServletTest\WebContent
	     *
	     * 	1) 프로젝트 경로에 정적자원(파일)이 있는 경우 웹 앱이 바라보는 경로에 파일이 자동으로 생성된다.
	     * 	2) 웹 앱이 바라보는 실제경로에 있는 파일이 프로젝트 경로에 없는 경우는 server를 clean하는 경우 삭제된다.
	     * 	   **주의할 점은 클라이언트 딴에서 서버로 업로드된 파일이 웹앱이 바라보는 실제경로에 들어가는 경우 clean하게 되면 모두 삭제된다.
	     */ 
	     
	    // => getRealPath(현재 웹 애플리케이션의 파일 경로) : 웹 앱이 바라보는 실제 경로를 리턴한다.
	    String path = serlvetContext.getRealPath("/resource/Spring.jpg"); 
	    System.out.println(path);

	    FileInputStream in = new FileInputStream(path);
	    // 바이너리를 출력할 때 MIME 타입을 지정해야 웹 브라우저가 제대로 출력할 수 있다.
	    
	    res.setContentType("image/png");
//	    res.setContentType("text/plain;charset=UTF-8");
	    //	>> 크로미움 기반의 브라우저는 어느정도는 자동으로 출력을 해준다.
	    //  >> IE는 mime를 지정하지 않으면 정상 출력, 잘못지정하면 다운로드가 된다.

	    BufferedOutputStream out = new BufferedOutputStream(res.getOutputStream(), 1024);		// 버퍼 사이즈 1024 지정

	    int b;								
	    while ((b = in.read()) != -1) {		// -1이면 파일을 모두 읽은것
	      out.write(b);						// 웹으로 응답
	    }

	    out.flush(); // 버퍼를 강제로 비운다
	    out.close();
		in.close();
	}
}
