<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>

let data=[
		{name: '무빙', actor: '류승룡'},	//data[0]
		{name: '더 글로리', actor: '송혜교'}		//data[1]
];


let str="<ul>";


for(let i=0; i < data.length; i++) {
	let item = data[i];
	str += "<li>" + item.name + "</li>";
}

str += "</ul>";
alert(str);
console.log( data);



let str2="";
data.forEach(fuction (item) {
	str2 += "<li>" + item.name + "</li>";
});

str2 += "</ul>"
alert(str2);


</script>

</body>
</html>