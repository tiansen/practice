<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<body onload="selectDivChange()">
	<br>
	<script type="text/javascript">
  		//$(document).ready(function(){  
  			//selectDivChange();
		//}); 
  	</script>
	<div id="selectDiv"></div>
	<table border="2" align="center" class="orderinf">
		<tr>
			<td colspan="3">按照用户ID查询： <select onchange="selectChange()"
				id="selectSId">
					<option value="0">all users</option>
					<s:iterator value="student_all_list" id="student">
						<s:if test="#student.SId==selectSId">
							<option value="${student.SId}" selected>${student.SId}</option>
						</s:if>
						<s:else>
							<option value="${student.SId}">${student.SId}</option>
						</s:else>
					</s:iterator>
			</select>
			</td>
		</tr>
		<tr>
			<th>用户ID</th>
			<th>用户名</th>
			<th>民族</th>
		</tr>
		<c:forEach items="${student_list}" var="student" varStatus="status">

			<tr>
				<td><input id="SId${status.count}" value="${student.SId}"
					readonly="readonly"></td>
				<td><input id="SName${status.count}" type="text"
					value="${student.SName}" readonly="readonly"
					ondblclick="changeReadOnly('SName${status.count}')"
					onkeydown="if(event.keyCode==13) {saveChange('SName',${status.count});return false;}">
				</td>
				<td><input id="nation${status.count}" type="text"
					value="${student.nation}" readonly="readonly"
					ondblclick="changeReadOnly('nation${status.count}')"
					onkeydown="if(event.keyCode==13) {saveChange('nation',${status.count});return false;}">
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
