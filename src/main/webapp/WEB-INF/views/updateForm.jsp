<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Title</title>
</head>
<body>
<center>
<form action="../update/{id}" method="post" >
<table
<tr>
<td Code :</td>
<td><input type=text readonly name="id" value="${data.id}"></td>
</tr>
<tr>
<td ">Artilce :</td>
<td><input type=text name="designation" value="${data.designation}"></td>
</tr>
<tr>
<td >prix :</td>
<td><input type=number min="1" name="prix" value="${data.prix}" ></td>
</tr>

<tr>
<td >Quantite en Stock :</td>
<td><input type=number min="1" name="quantite" value="${data.quantite}"></td>
</tr>
<tr >
<td><center><button type="reset" Annuler</button></center></td>
<td><center><input type=submit value="Modifier"></center></td>
</tr>
</table>
</form>
</center>
</body>
</html>