package listenerTest;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener 	// 리스너를 web.xml에서 등록하지 않고 어노테이션을 사용하여 등록 
public class MySecondListener_ServletContextLIstener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listenerTest.MySecondListener_ServletContextLIstener : [contextInitialized] 2번째 리스너  - 서블릿 컨테이너가 생성 되었습니다.");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listenerTest.MySecondListener_ServletContextLIstener : [contextDestroyed] 2번째 리스너 - 서블릿 컨테이너가  소멸되었습니다.");
	}
}
