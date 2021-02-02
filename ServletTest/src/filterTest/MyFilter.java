package filterTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filterTest.MyFilter : [init] MyFilter가 생성되었습니다.");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("\n======================[MyFilter Start]======================");
		System.out.println("filterTest.MyFilter : [doFilter] myFilter 호출");
		System.out.println("filterTest.MyFilter : [doFilter] myFilter 통과");
		System.out.println("filterTest.MyFilter : [doFilter] (is다음필터)? 다음 필터 호출: Servlet 호출");
//		req.setCharacterEncoding("UTF-8");	// 안먹음.
		filterChain.doFilter(req, res);
		System.out.println("filterTest.MyFilter : [doFilter] myFilter 종료");
		System.out.println("======================[MyFilter end]======================\n");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filterTest.MyFilter : [destroy] MyFilter가 소멸되었습니다.");
	}
}
