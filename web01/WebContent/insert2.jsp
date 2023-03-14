<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주세요.(request이용) -->
    <!-- 2. dao에게 값 전달.(DAO이용) 생략 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    
    <!-- 자바로 인식되는 부분 -->
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
<style>
body {
	background: #b8d3ff
}
</style>
</head>
<body>
게시판글 작성 요청되었음.
<hr color="pink">
작성한 no: <%=no %> <br>
작성한 title: <%=title %> <br>
작성한 content: <%=content %> <br>
작성한 writer: <%=writer %> <br>
</body>
</html>