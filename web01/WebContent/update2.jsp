<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String no = request.getParameter("no");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: #fac4ff;
}
</style>
</head>
<body>
게시글 수정 요청되었음.
<hr color="blue">
수정한 no : <%= no %> <br>
수정한 title : <%= title %> <br>
수정한 content : <%= content %> <br>
수정한 writer : <%= writer %> <br>
</body>
</html>