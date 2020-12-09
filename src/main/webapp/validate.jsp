<!DOCTYPE html>
<%@page import="com.student.entity.Student"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
<title>Student Data</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>
<body>
	<header style="height: 30px; background-color: maroon;" />
	<hr />
	<img src="img/student.gif" style="height: 175px" />
	
	
	<div>
		<div>
			<h3>
				<span>Student Data Table</span>
			</h3>
			<hr>
			<span style="font-size: 18; color: blue; font-weight: bold;">${message}</span>
			<hr>
		</div>
		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Major</th>
					<th>Level</th>
					<th>Action</th>
				</tr>
				<%
					List<Student> list = (List<Student>) request.getAttribute("list");
				for(Student s : list){
				%>
				<tr>
					<td><%=s.getId() %></td>
					<td><%=s.getName()%></td>
					<td><%=s.getMajor()%></td>
					<td><%=s.getLevel()%>y</td>
					<td>
					
					<a href="delete?id=<%=s.getId()%>">Delete  </a>|
					<a href="edit?id=<%=s.getId()%>">Edit</a>
					</td>
					
				</tr>
				<%
					}
				%>

			</table>
		</div>
		<hr />
		<div>
			<a href="addStudent"><button type="button"
					class="btn btn-success" style="align-content: center;">Add
					Data</button></a> <a href="home"><button type="button"
					class="btn btn-danger">Log out</button></a>

		</div>
	</div>
</body>
</html>