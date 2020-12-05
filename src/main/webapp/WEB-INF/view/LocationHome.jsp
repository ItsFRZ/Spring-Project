<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align:center;">Enter Locations</h1><br><br>
	<form action="saveLocations" method="post">
		<input type="text" name="lid" placeholder="Id"><br><br>
		<input type="text" name="lpincode" placeholder="Country Code"><br><br>
		<input type="text" name="lname" placeholder="Country Name"><br><br>
		
		<h5>Continent</h5> 
		<input type="radio" name="lregion" value="Asia" id="a" label="Asia">
		<label for="a">Asia</label>
		
		<input id="e" type="radio" name="lregion" value="Europe" label="Europe">
		<label for="e">Europe</label>
		
		<input type="radio" name="lregion" value="Africa" id="Africa">
		<label for="Africa">Africa</label>
		
		
		<input type="radio" name="lregion" value="North America" id="na" label="North America">
		<label for="na">North America</label>
		
		<input type="radio" id="sa" name="lregion" value="South America" label="South America">
		<label for="sa">South America</label>
		
		<input type="radio" name="lregion" value="Antartica" id="Antartica">
		<label for="Antartica">Antartica</label>
		<br><br>
		
		<input type="submit" value="Register">
	
	</form>
	<a href="viewLocations">View Records</a>

</body>
</html>