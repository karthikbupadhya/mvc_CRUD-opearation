package mvc_crud.helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr={MyConfigClass.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arr={"/"};
		return arr;
	}
}