<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet"
	href="http://localhost:8080/CodingTest/resources/css/bootstrap.min.css">
<script
	src="http://localhost:8080/CodingTest/resources/js/jquery.min.js"></script>
<script
	src="http://localhost:8080/CodingTest/resources/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="http://localhost:8080/CodingTest/resources/css/jquery-ui.css">
<script
	src="http://localhost:8080/CodingTest/resources/js/jquery-1.10.2.js"></script>
<script src="http://localhost:8080/CodingTest/resources/js/jquery-ui.js"></script>
<script src="http://localhost:8080/CodingTest/resources/js/cal.js"></script>
<script
	src="http://localhost:8080/CodingTest/resources/js/MasterCheckBox.js"></script>


<script
	src="http://localhost:8080/CodingTest/resources/fonts/glyphicons-halflings-regular.eot"></script>
<script
	src="http://localhost:8080/CodingTest/resources/fonts/glyphicons-halflings-regular.svg"></script>
<script
	src="http://localhost:8080/CodingTest/resources/fonts/glyphicons-halflings-regular.ttf"></script>
<script
	src="http://localhost:8080/CodingTest/resources/fonts/glyphicons-halflings-regular.woff"></script>
<script
	src="http://localhost:8080/CodingTest/resources/fonts/glyphicons-halflings-regular.woff2"></script>



<style>
.error {
	color: red;
	font-weight: bold;
}

.success {
	color: green;
	font-weight: bold;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>
	<div class="row" style="margin-top: 60px; height: 710px">
		<div class="container-fluid">
			<tiles:insertAttribute name="menu"></tiles:insertAttribute>
		</div>

		<div class="container-fluid">
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>
	</div>
	<div class="container-fluid text-center">
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
</body>
</html>
