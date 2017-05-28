<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@page isELIgnored="false"%>
<div style="margin-top: 50px">

	<c:if test="${!empty success}">
		<div class="alert alert-success" style="margin-top: 20px">
			<center>
				<span class="glyphicon glyphicon-saved"></span> ${success}
			</center>
		</div>
	</c:if>
	<c:if test="${!empty error}">
		<div class="alert alert-danger" style="margin-top: 20px">
			<center>
				<span class="glyphicon glyphicon-alert"></span> ${error}
			</center>
		</div>

	</c:if>
	<sf:form action="Course" method="post" commandName="form">

		<sf:hidden path="id" />
		<sf:hidden path="createdBy"></sf:hidden>
		<sf:hidden path="modifiedBy"></sf:hidden>
		<sf:hidden path="createdDatetime"></sf:hidden>
		<sf:hidden path="modifiedDatetime"></sf:hidden>

		<div class="col-md-offset-3">

			<div class="row" style="margin-top: 70px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="courseName">
						Course Name :
					</sf:label>
				</div>

				<div class="col-md-4">
					<sf:input path="courseName" cssClass="form-control"
						placeholder="Enter Course Name" />
				</div>
				<div class="col-md-3">
					<sf:errors path="courseName" cssClass="error" />
				</div>
			</div>
			<div class="row" style="margin-top: 20px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="description">
						Description
					</sf:label>
				</div>
				<div class="col-md-4">
					<sf:input path="description" cssClass="form-control"
						placeholder="Enter Description" />
				</div>
				<div class="col-md-3">
					<sf:errors path="description" cssClass="error" />
				</div>
			</div>
			<div class="row" style="margin-top: 20px">
				<div class="col-md-2 col-md-offset-1">
					<sf:label path="duration">
						Duration
					</sf:label>
				</div>
				<div class="col-md-4">
					<sf:select cssClass="form-control" size="0" path="duration">
						<sf:option value="Select" label="Select" />
						<sf:option value="1Year" label="1Year" />
						<sf:option value="2Year" label="2Year" />
						<sf:option value="3Year" label="3Year" />
						<sf:option value="4Year" label="4Year" />
						<sf:option value="5Year" label="5Year" />
					</sf:select>

				</div>
				<div class="col-md-3">
					<sf:errors path="duration" cssClass="error" />
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