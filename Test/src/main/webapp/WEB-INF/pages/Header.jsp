<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<link rel="stylesheet"
	href="http://localhost:8080/CodingTest/resources/css/bootstrap.min.css">
<script
	src="http://localhost:8080/CodingTest/resources/js/jquery.min.js"></script>
<script
	src="http://localhost:8080/CodingTest/resources/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="http://localhost:8080/CodingTest/resources/css/jquery-ui.css">

<%@ page isELIgnored="false"%>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Curse Application</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="/Welcome">Home</a></li>


			<li><a href="/Registration">Course Registration</a></li>
			<li class="dropdown"><a href="/Registration"
				class="dropdown-toggle" data-toggle="dropdown" role="button"
				aria-haspopup="true" aria-expanded="false">Student <span
					class="caret"></span></a>
				<ul class="dropdown-menu">

					<li><a href="<c:url value="/Student" />"><span
							class="glyphicon glyphicon-plus"></span> Add Student</a></li>
					<li><a href="<c:url value="/Course" />"><span
							class="glyphicon glyphicon-plus"></span> Add Course</a></li>

				</ul></li>
		</ul>
	</div>
</nav>
<div id="first3"></div>

</body>
</html>