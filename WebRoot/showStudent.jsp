<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
This is my JSP page. <br>
<table border="2" align="center" class="orderinf">
	<tr>
		<th>用户ID</th>
		<th>订单时间</th>
		<th>订单总价</th>
	</tr>
	<c:forEach items="${student_list}" var="student">

		<tr>
			<td>${student.SId}</td>
			<td>${student.SName}</td>
			<td>${student.nation}</td>
		</tr>
	</c:forEach>
</table>
