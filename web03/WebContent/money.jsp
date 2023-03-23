<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //얘를 띄워줬기 때문에 ajax3에서 trim을 해야한다
    String m = request.getParameter("money");
    String choice = request.getParameter("choice");
    
    int money = Integer.parseInt(m);
    switch(choice){
    case "1":
    	money = money - 1000;
    	break;
    case "2":
    	money = money + 1000;
    	break;
    }
    %><%= money %>