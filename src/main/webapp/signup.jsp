<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;

}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}
</style>
</head>
<body>
<header style="height: 30px; background-color: maroon;" />
<br>
	<h2>Sign Up!!</h2>

	<form action="signup" method="post">
		<div class="imgcontainer">
			<img src="img/studentlogin.jpeg" style="height: 150px; width:150px;" alt="Avatar"
				class="avatar">
		</div>
<hr/>
<span style="font-size: 18;color: blue;font-weight: bold;">${message}</span>
<hr/>
		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="uname" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw" required>

			<button type="submit">save</button>
			
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="reset" class="cancelbtn">clear</button>
			<a href="home"><button  type="button" class="cancelbtn">Log in</button></a>
			
		</div>
	</form>

</body>
</html>