package listenerTest;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyFirstListener_ServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("listenerTest.MyFirstListener_ServletContextListener : [contextInitialized] 서블릿 컨테이너가 생성 되었습니다.");
		sce.getServletContext().setAttribute("newId", "new Id");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("listenerTest.MyFirstListener_ServletContextListener : [contextDestroyed] 서블릿 컨테이너가  소멸되었습니다.");
	}
}
