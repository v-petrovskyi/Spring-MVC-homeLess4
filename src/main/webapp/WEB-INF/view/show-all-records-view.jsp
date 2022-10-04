<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All records</title>
</head>
<body>
<h1>All records</h1>
<table>
    <tr>
        <th>record</th>
    </tr>
    <c:forEach var = "rec" items="${allRecordsList}">
        <tr>
            <td>${rec}</td>
        </tr>
    </c:forEach>
</table>
<br>
<h1>
    <a href="add-record">Add new record</a>
</h1>


</body>
</html>
