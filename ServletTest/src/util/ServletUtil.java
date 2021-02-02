package util;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletUtil {
	
	public static void printWriteHtml(ServletRequest request, ServletResponse response) throws IOException {
		response.setContentType("text/html");
//		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");	// mime type, 인코딩 설정
		
		response.getWriter().print("<html><body>");
		response.getWriter().print("<h1>call myServlet</h1><br>");
		response.getWriter().print("Servlet Class Name : " + request.getServletContext().getAttribute("this Servlet Class Name"));
		
		response.getWriter().print("<br>Hello!<br>");
		response.getWriter().print("안녕하세요!<br>");
		response.getWriter().print("こんにちは<br>");
		response.getWriter().print("您好<br>");
		response.getWriter().print("مع السلامة؛ إلى اللقاء!<br>");
		
		response.getWriter().print("<h1><a href=\"../ServletTest\">go home(뒤로가기)</a></h1>");
		response.getWriter().print("</body></html>");
	}
	
	public static void printMethod(String className, String method) {
		String content = "";
		
		/* interface Servlet의 추상 메서드 설명 */
		switch(method) {
			/* Life Cycle 관련 메소드*/
			case "init":
				content = "서블릿 컨테이너(tomcat)가 서블릿(MakeServlet)을 생성, 초기화하기 위해 호출되는 메소드.\n요청을 처리하기 전에 해야할 준비 작업등을 처리.(DB연결, 프로퍼티 로딩등 준비)";
				break;
			case "service":
				content = "클라이언트가 요청할 때마다 호출되는 메소드.(실질적인 서비스 작업을 수행)";
				break;
			case "destroy":
				content = "서블릿 컨테이너(tomcat)가 종료 또는 웹앱이 종료되면 호출되는 메서드.(자원해제, 데이터 저장 등의 마무리 작업 수행)";
				break;
			/* 보조 메소드 */
			case "getServletConfig":
				content = "서블릿 설정 정보를 다루는  ServletConfig 객체 반환.\nServletConfig를 통해 서블릿 이름, 서블릿 초기 매개변수 값 서블릿 환경 정보등을 얻을수 있다.";
				break;
			case "getServletInfo":
				content = "서블릿 작성자, 버전, 저작권 등의 정보를 담은 문자열을 반환한다."; 
				break;
			default:
				throw new Error("interface Servlet에 선언되지 않은 추상 메서드 입니다.");
		}
		System.out.println("\n" + className + " : \n"
							+ "======================[" + method + "]======================\n" 
							+ content + "\n" );
	}
}
