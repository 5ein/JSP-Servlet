<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //자바코드 넣는 부분!!
    String id = request.getParameter("id"); //받아와서 저장해주기, 받는거는 항상 String
    String pw = request.getParameter("pw"); //"1234"
    String name = request.getParameter("name"); //"apple"
    String tel = request.getParameter("tel"); //"010"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
회원수정 요청되었음.
<hr color="red">
수정한 id : <%= id %> <br> <!-- %= 변수값이 출력된다  -->
수정한 pw : <%= pw %> <br>
수정한 name : <%= name %> <br>
수정한 tel : <%= tel %> <br>
</body>
</html>