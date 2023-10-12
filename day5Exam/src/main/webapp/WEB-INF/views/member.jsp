<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 테이블</title>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>


	function reg() {
		
		
		let id = $("#id").val();
		let pwd = $("#pwd").val();
		let name = $("#name").val();
		let email = $("#email").val();
		let birth = $("#birth").val();
		let sns = $("#sns").val();
		
		
		let m = {id:id, pwd:pwd, name:name, email:email, birth:birth, sns:sns};
		
		let members = JSON.stringify(m);
		
		console.log(members);
		
		$.ajax({
			type: "POST",
			url: "/Exam/reg",
			data: members,
			contentType: "application/json",
			success: function(data) {
				window.location.reload();
			},
			error: function() {
				alert("error");
			}
		});
		
		
		
		
		
	}
	





</script>

</head>
<body>

<h2>멤버 리스트</h2>
<table>
	<tr>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>이메일</th>				
		<th>생일</th>
		<th>SNS</th>
		<th>현재 시간</th>
	</tr>
	<c:forEach var="m" items="${list}">
		<tr>
			<td>${m.id}</td>
			<td>${m.pwd}</td>
			<td>${m.name}</td>
			<td>${m.email}</td>
			<td>${m.birth}</td>
			<td>${m.sns}</td>
			<td>${m.reg_date}</td>
			<td><button>수정</button><button>삭제</button></td>																		
		</tr>
	
	</c:forEach>
	
		<tr>
		<td><input type="text" id="id"></td>
		<td><input type="text" id="pwd"></td>
		<td><input type="text" id="name"></td>
		<td><input type="text" id="email"></td>
		<td><input type="text" id="birth"></td>
		<td><input type="text" id="sns"></td>												
		<td><button onclick="reg()">등록</button></td>

</table>


</body>
</html>