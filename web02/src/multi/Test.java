package multi;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Test")  //@(어노테이션)을 여기서 안쓸 때는 web.xml에 가서 입력해주어야함!
public class Test extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		String no = config.getInitParameter("no");
		System.out.println(no);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
