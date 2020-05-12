<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<th>用户编码</th>
				<th>用户名</th>
				<th>用户地址</th>
				<th>出生日期</th>
				<th>联系方式</th>
			</tr>
			<c:forEach items="${list }" var="user">
				<tr>
					<td>${user.userCode }</td>
					<td>${user.userName }</td>
					<td>${user.address }</td>
					<td><fmt:formatDate value="${user.birthday }" 
						pattern="yyyy-MM-dd"/></td>
					<td>${user.phone }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>