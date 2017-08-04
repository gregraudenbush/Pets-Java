<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Make a Pet</title>
<link href="./styles.css" rel="stylesheet" type="text/css">


</head>
<body>
<%-- ${dogName}
${dogBreed} --%>


	<div class="formdiv">
		<p>Make a Dog!</p>
		<form action="AnimalServlet" method="POST">
			Name:<br>
			<input type="text" name="dogName"><br>
			Breed:<br>
			<input type="text" name="dogBreed"><br>
			Weight:<br>
			<input type="number" name="dogWeight"><br>
			<input type="hidden" name="cord" value="dog">
			<input type="submit">
		</form>
	</div>
	
	<div class="formdiv">
		<p>Make a Cat!</p>
		<form action="servlet2" method="POST">
			Name:<br>
			<input type="text" name="catName"><br>
			Breed:<br>
			<input type="text" name="catBreed"><br>
			Weight:<br>
			<input type="number" name="catWeight"><br>
			<input type="hidden" name="cord2" value="cat">
			<input type="submit">
		</form>
	</div>

<%-- <% int myVar = (int) request.getAttribute("myVar"); %>  --%>
</body>
</html>