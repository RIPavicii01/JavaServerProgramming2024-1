<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%
   		
   		long result = 0;
   		int n1 = Integer.parseInt(request.getParameter("n1"));
   		int n2 = Integer.parseInt(request.getParameter("n2"));
   		
   		switch(request.getParameter("op")){
   		case "+":result = n1+n2;break;
   		case "-":result = n1-n2;break;
   		case "*":result = n1*n2;break;
   		case "/":result = n1/n2;break;
   		}
   	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 계산결과 : 장형준</title>
</head>
<body>
<h2> 계산 결과 - JSP  : 장형준</h2>
<hr>
결과 : <%=result %>


</body>
</html>