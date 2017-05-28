
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>

<%@ page isELIgnored="false"%>
<div style="margin-top: 50px">

	<center>
		<h2 class="success">${success}</h2>
	</center>
	<center>
		<h2 class="error">${error}</h2>
	</center>
	<sf:form action="Student" method="post" commandName="form">

		<sf:hidden path="id" />
		<sf:hidden path="createdBy"></sf:hidden>
		<sf:hidden path="modifiedBy"></sf:hidden>
		<sf:hidden path="createdDatetime"></sf:hidden>
		<sf:hidden path="modifiedDatetime"></sf:hidden>

		<div class="col-md-offset-3">
			<div class="row" style="margin-top: 70px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="firstName">
						First Name :
					</sf:label>
				</div>

				<div class="col-md-4">
					<sf:input path="firstName" cssClass="form-control"
						placeholder="Enter Name" />
				</div>

				<div class="col-md-3">
					<sf:errors path="firstName" cssClass="error" />
				</div>
			</div>
			<div class="row" style="margin-top: 20px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="lastName">
						Last Name :
					</sf:label>
				</div>
				<div class="col-md-4">
					<sf:input path="lastName" cssClass="form-control"
						placeholder="Enter Last Name" />
				</div>
				<div class="col-md-3">
					<sf:errors path="lastName" cssClass="error" />
				</div>
			</div>
			<div class="row" style="margin-top: 20px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="dob">
						Date of Birth :
					</sf:label>
				</div>
				<div class="col-md-4">
					<sf:input path="dob" cssClass="form-control"
						placeholder="Enter DOB" />
				</div>
				<div class="col-md-3">
					<sf:errors path="dob" cssClass="error" />
				</div>
			</div>

			<div class="row" style="margin-top: 20px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="mobileNo">
						Mobile No. :
					</sf:label>
				</div>
				<div class="col-md-4">
					<sf:input path="mobileNo" cssClass="form-control"
						placeholder="Enter Mobile No" />
				</div>
				<div class="col-md-3">
					<sf:errors path="mobileNo" cssClass="error" />
				</div>
			</div>

			<div class="row" style="margin-top: 20px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="email">
					Email Id :
					</sf:label>
				</div>
				<div class="col-md-4">
					<sf:input path="email" cssClass="form-control"
						placeholder="Enter Email" />
				</div>
				<div class="col-md-3">
					<sf:errors path="email" cssClass="error" />
				</div>
			</div>
		</div>

		<div class="row" style="margin-top: 20px;">
			<div class="col-md-5  col-md-offset-3">
				<button type="submit" class="btn btn-primary" name="operation"
					value="Save">
					<span class="glyphicon glyphicon-save"></span> Save
				</button>
			</div>
		</div>
</div>

</sf:form>
</div>
<script>
	$(function() {
		$("#dob").datepicker({
			changeMonth : true,
			changeYear : true

		});
	});
</script>
