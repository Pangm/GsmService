<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Information</title>
</head>
<body>
	<form method="post" action="info">
		Username: <br /> <input type="text" name="name">
		<hr />
		Gender: <br /> Female: <input type="radio" name="gender"
			value="female"> Male: <input type="radio" name="gender"
			value="male">
		<hr />
		What color you like: <br /> Red: <input type="checkbox" name="color"
			value="red"> Green: <input type="checkbox" name="color"
			value="green"> blue: <input type="checkbox" name="color"
			value="blue">
		<hr />
		Nationality: <select name="country">
			<option value="China">China</option>
			<option value="America">America</option>
			<option value="Russia">Russia</option>
		</select>
		<hr />
		<input type="submit" value="Submit"> <input type="reset"
			value="Reset">
	</form>
</body>
</html>