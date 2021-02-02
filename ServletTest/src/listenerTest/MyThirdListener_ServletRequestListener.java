package listenerTest;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener	// 리스너를 web.xml에서 등록하지 않고 어노테이션을 사용하여 등록 
public class MyThirdListener_ServletRequestListener implements ServletRequestListener {
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// 요청이 들어 왔을 때 호출된다.
		System.out.println("listenerTest.MyThirdListener_ServletRequestListener : [requestInitialized] (생성)요청이 들어왔습니다.");
	    HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		System.out.println("listenerTest.MyThirdListener_ServletRequestListener : 클라이언트 IP - " + request.getRemoteAddr());
	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : 요청 URL - " + request.getServletPath());
	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : getProtocol - " + request.getProtocol());
	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : getMethod - " + request.getMethod());
	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : getQueryString - " + request.getQueryString());
//	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : getRequestURI - " + request.getRequestURI());
//	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : getCookies - " + request.getCookies());
//	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : getContentType - " + request.getContentType());
//	    System.out.println("listenerTest.MyThirdListener_ServletRequestListener : getCharacterEncoding - " + request.getCharacterEncoding());
	}
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("listenerTest.MyThirdListener_ServletRequestListener : [requestDestroyed] (소멸)요청이 완료 되었습니다.");
	}
}
