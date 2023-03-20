package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/monday.do") //@어노테이션을 사용하지 않으면 web.xml에서 처리해주기!
public class Monday extends HttpServlet {
	String temp = ""; //전역변수를 사용하면 init뿐만아니라 get과 post에서도 쓸수가 있다!
	
	public void init(ServletConfig config) throws ServletException {
//		String temp = config.getInitParameter("temp"); //여기서 하면 init만 사용가능!
		temp = config.getInitParameter("temp");
		System.out.println(temp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("월요일 날씨: " + temp); //전역변수로 한것 사용해주기
		out.close(); //얘를 안하면 늦게 닫혀서 그동안 쓰지않는 것이 cpu와 ram에 남아있게됨.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
