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
<table border="9">
<tr>
<th>Code</th>
<th>ARTICLES</th>
<th>Prix</th>
<th>Quantite</th>
<th colspan="2">
<center>
<a href="produits/add">Ajouter</a>
</center>
</th>
</tr>
<c:forEach items="${listproduit}" var="row">
<tr>
<td>${row.id}</td>
<td>${row.designation}</td>
<td>${row.prix}</td>
<td>${row.quantite}</td>
<td>
<center>
<a href="produits/delete/${row.id}">Supprimer</a>
</center>
</td>
<td>
<center>
<a href="produits/edit/${row.id}">Modifier</a>
</center>
</td>
</tr>
</c:forEach>

</table>
</center>
</body>
</html>