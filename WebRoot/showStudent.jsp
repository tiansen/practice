<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<br>
  	<script type="text/javascript">
  		function changeReadOnly(typeName){
  			document.getElementById(typeName).readOnly=false;
  		}
  		function saveChange(typeName){
  			alert(document.getElementById(typeName).value);
  			document.getElementById(typeName).readOnly=true;
  		}
  	</script>
<table border="2" align="center" class="orderinf">

	<tr>
		<th>用户ID</th>
		<th>订单时间</th>
		<th>订单总价</th>
	</tr>
	<c:forEach items="${student_list}" var="student" varStatus="status">

		<tr>
			<td>
				<input id="SId${status.count}" type="text" value="${student.SId}" readonly="readonly" ondblclick="changeReadOnly('SId${status.count}')" onkeydown="if(event.keyCode==13) {saveChange('SId${status.count}');return false;}">
			</td>
			<td>
				<input id="SName${status.count}" type="text" value="${student.SName}" readonly="readonly" ondblclick="changeReadOnly('SName${status.count}')" onkeydown="if(event.keyCode==13) {saveChange('SName${status.count}');return false;}">
			</td>
			<td>
				<input id="nation${status.count}" type="text" value="${student.nation}" readonly="readonly" ondblclick="changeReadOnly('nation${status.count}')" onkeydown="if(event.keyCode==13) {saveChange('nation${status.count}');return false;}">
			</td>
		</tr>
	</c:forEach>
</table>
