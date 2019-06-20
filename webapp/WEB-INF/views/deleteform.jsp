<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Post</title>
</head>
<body>
	<form action="/guestbook/main/delete?no=${ param.no }" method="post">
		<table>
			<tr>
				<td>삭제하시겠습니까?</td>
				<td><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
	<a href="/old_post/index">메인으로 돌아가기</a>
</body>
</html>