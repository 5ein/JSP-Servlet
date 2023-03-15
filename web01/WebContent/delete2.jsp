<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 NO를 서버에서 받아주기(자바로!)
    	//HttpServletRequest request = new HttpServletRequest();
    	String no = request.getParameter("no"); //외부에서 전달된것은 모두 String
    	//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제</title>
<style type="text/css">
body {
	background: #fac4ff;
}
</style>
</head>
<body>
당신이 삭제를 원하는 번호는 : <%= no %>
</body>
</html>