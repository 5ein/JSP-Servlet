package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/check.do")
public class Check extends HttpServlet {
	
//생명주기 --
//init + ctrl + spacebar + enter
@Override 
public void init(ServletConfig config) throws ServletException {  
	//서블릿 만들 때, 패스워드가 안맞을때, 어떻게 할것인지 지정!
	System.out.println("Check 서블릿 객체가 하나 만들어 진다.");
}

//des + ctrl + spacebar + enter
@Override 
	public void destroy() {      
	System.out.println("Check 서블릿 소멸됨");
}
//-- 생명주기

	//get요청, 클라이언트로 부터 전달되는 데이터는 주소와 함께 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String today = request.getParameter("today");
		String result = "";
		if (today.equals("맑음")) {
			result = "나가자";
		}else if (today.equals("흐림")) {
			result = "코딩하자";
		}else if (today.equals("비옴")) {
			result = "쇼핑하자";
		}else {
			result = "그냥 있자";
		}
		
		//setCOntentType은 out만들기 전에 설정!! 
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 방식은 request 처음에 꼭해주기
		request.setCharacterEncoding("UTF-8");
		
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다<img src='no.png' width='600' height='200'>";
		if (pass.equals("나는왕이다")) {
			result = "들어오세요<img src='yes.png' width='600' height='200'>";
		}
		
		//setCOntentType은 out만들기 전에 설정!! 
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

}
