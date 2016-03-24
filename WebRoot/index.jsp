<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<script type="text/javascript" src="./js/myjs.js"></script>
<script type="text/javascript" src="./js/jquery.validate.min.js"></script>
<script type="text/javascript" src="./js/jquery.js"></script>
  <head>
    <base href="<%=basePath%>">
    
    <title>Home Page</title>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <input id = 'defaultContent' type = 'hidden' value = "hello world!">
  	<script type="text/javascript">
  		
  	</script>
  	<input type = 'button' onclick = "fillWithWords()" value="click here">
  	<br>
  	
  	<input id="show" type = 'text'>
  	<form action="loadAllStudent" method = "post">
  		<input type = 'submit'  value="submit">
  	</form>
  	<div id = "showStudent" >
  	</div>
  </body>
</html>
