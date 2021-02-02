package filterTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MySecondFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filterTest.MySecondFilter : [init] MySecondFilter가 생성되었습니다.");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("\n======================[MySecondFilter Start]======================");
		System.out.println("filterTest.MySecondFilter : [doFilter] MySecondFilter 호출");
		System.out.println("filterTest.MySecondFilter : [doFilter] MySecondFilter 통과");
		System.out.println("filterTest.MySecondFilter : [doFilter] (is다음필터)? 다음 필터 호출: Servlet 호출");
		filterChain.doFilter(req, res);
		System.out.println("filterTest.MySecondFilter : [doFilter] MySecondFilter 종료");
		System.out.println("======================[MySecondFilter End]======================\n");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filterTest.MySecondFilter : [destroy] MySecondFilter가 소멸되었습니다.");
	}
}
