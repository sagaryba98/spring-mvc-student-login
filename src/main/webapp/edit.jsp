
<!DOCTYPE html>
<html lang="en">
<head>
<title>Add Student Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<header style="height: 30px; background-color: maroon;" />
	<br>
	<div class="container">
		<br>
		<h2>Add Student Page!!!</h2>
		<img src="img/student.gif" style="height: 120px;">
		<hr />
		<span style="font-size: 18; color: blue; font-weight: bold;">${message}</span>
		<hr />
		<div>
			<div style="width: 60%">
				<form action="edit" method="POST">
				<input type="hidden" name="id" value="${student.id}">
					<div class="form-group">
						<label>Name:</label> <input type="text" class="form-control"
							value="${student.name }" name="name" required="required">
					</div>
					<div class="form-group">
						<label>Major:</label> <input type="text" class="form-control"
							value="${student.major }" name="major" required="required">
					</div>

					<div>
						<label for="cars">Choose Your Level:</label> <select name="level"
							id="level">
							<option value="Freshman">Freshman</option>
							<option value="Junior">Junior</option>
							<option value="Sophomore">Sophomore</option>
							<option value="Senior">Senior</option>
						</select>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
					<a href="validated"><button type="button"
							class="btn btn-primary">Show Data</button></a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>