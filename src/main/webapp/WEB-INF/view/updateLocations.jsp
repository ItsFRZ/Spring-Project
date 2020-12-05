<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 style="text-align:center;">Update Location</h1><br><br>
	<form action="saveLocations" method="post">
	
		<input type="text" name="lid" value="${location.lid }" placeholder="Id" readonly="readonly"><br><br>
		<input type="text" name="lpincode" value="${location.lpincode }" placeholder="Country Code"><br><br>
		<input type="text" name="lname" value="${location.lname }" placeholder="Country Name"><br><br>
		
		<h5>Continent</h5> 
		<input type="radio" name="lregion" value="Asia" checked="${location.lregion == 'Asia'?true:false }" id="a" label="Asia">
		<label for="a">Asia</label>
		
		<input id="e" type="radio" name="lregion" value="Europe" checked="${location.lregion == 'Europe'?true:false }" label="Europe">
		<label for="e">Europe</label>
		
		<input type="radio" name="lregion" value="Africa" checked="${location.lregion == 'Africa'?true:false }" id="Africa">
		<label for="Africa">Africa</label>
		
		
		<input type="radio" name="lregion" value="North America" checked="${location.lregion == 'North America'?true:false }" id="na" label="North America">
		<label for="na">North America</label>
		
		<input type="radio" id="sa" name="lregion" value="South America" checked="${location.lregion == 'South America?true:false' }" label="South America">
		<label for="sa">South America</label>
		
		<input type="radio" name="lregion" value="Antartica" checked="${location.lregion == 'Antartica?true:false' }" id="Antartica">
		<label for="Antartica">Antartica</label>
		<br><br>
		
		<input type="submit" value="Update">
	
	</form>
</body>
</html>