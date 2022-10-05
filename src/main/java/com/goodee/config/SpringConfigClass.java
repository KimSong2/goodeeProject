package com.goodee.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// 전체 환경 설정을 해주는 엔트리 클래스
public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer{
	//AbstractAnnotationConfigDispatcherServletInitializer 다이나믹 웹프로젝트 설정을 담고있는 추상클래스
	//자바로 설정할 때 많이 사용. 프로젝트를 시작하게 되면 이클래스를 상속받은 클래스를 먼저 읽음
	
	
	
	// 프로젝트에서 사용할 Bean들을 정의하기 위한 클래스를 지정한다.
	// MVC패턴에서 컴포넌트로 선언해야 하는 빈 말고 임시적으로 선언해야 하는 빈이 생길 수 있는데
	// 이러한 빈들을 설정해주기 위한 클래스의 위치를 여기서 지정
	// 임시로 쓰게 될 빈들에 대한 내용을 사용하고자 할 때 사용할 클래스
	// ?는 와일드카드. 어떤 클래스든 상관없이 다 입력받을 수 있음
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootAppContext.class}; 
	}

	// Spring MVC 프로젝트 설정을 위한 클래스를 지정한다.
	// 실제 MVC의 설정정보를 담고 있음
	// MVC프로젝트를 구성하는데 필요한 설정정보를 담은 클래스를 지정할 때 사용.
	// 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ServletAppContext.class};
	}
	
	// DispatcherServlet에 매핑할 요청 주소를 세팅한다.
	// 서블릿에서 제공하는 스펙.
	// 어떤 주소로 접근을 했을 때 여기있는 정보를 먹일거냐
	// 사용자가 어떤 url주소로 접근했을때 여기 있는 정보를 적용할거냐.
	// root정보로 들어가야하기 때문에 /를 씀.
	//설정했던 정보를 사용자가 어떤 url로 접근을 할 때 적용할거냐
	// 사용자가 어떤 주소로 접근하면 설정한 정보를 적용시킬거야.!
	// 
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	// 파라미터 인코딩 필터 설정
	// 서블릿에서 제공하는 스펙.
	// 서블릿에서 setcharactor로 썼던걸 전역으로 설정.
	// 해당파라미터에 대한 내용이 깨지는 걸 방지 
	
	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}
}



