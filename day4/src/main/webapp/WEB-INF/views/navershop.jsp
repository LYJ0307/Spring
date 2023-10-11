<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>

img{
	width: 500px;
	height: 500px;
}

</style>
<body>

<c:forEach var="shop" items="${list}">

	${shop.title}
	${shop.link}
	${shop.lprice}
	<img src="${shop.image}">

</c:forEach>

</body>
</html>