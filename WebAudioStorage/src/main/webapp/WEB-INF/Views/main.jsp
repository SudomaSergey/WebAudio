<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="Res/CSS/style.css">
<title>Audio Storage</title>
</head>
<body>

	<div id="logo">
		<img src="Res/Images/logo.png" width="150" height="150">
	</div>
	
	<%for(int i = 0; i < 5; i++){
		out.print("<div id=\"audio\">");
		out.print("<br> <audio controls> <source src=\"Res/1.mp3\" type=\"audio/mpeg\"> ");
		out.print("</div>");
	}	
	%>
	
</body>
</html>