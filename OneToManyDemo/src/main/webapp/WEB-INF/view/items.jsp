<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        .button-container {
            text-align: center; /* Align buttons to the center */
        }

        .button-container form {
            display: inline-block; /* Make forms display inline */
            margin: 0 10px; /* Add some spacing between buttons */
        }
    </style>
</head>
<body>
<div class="button-container">
    <form action="/add">
        <input type="submit" value="Add">
    </form>
    <form action="/selectRestaurant">
        <input type="submit" value="Add Item">
    </form>
    <form action="/all">
        <input type="submit" value="Get All">
    </form>
</div><br>
<br>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Category</th>
        <th>Cuisine</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="item" items="${items}">
        <tr>
            <td><c:out value="${item.getName()}"/></td>
            <td><c:out value="${item.getCategory()}"/></td>
            <td><c:out value="${item.getCuisine()}"/></td>
            <td>
                <form action="/updateItems">
                    <input type="hidden" name="itemID" value="${item.getItemID()}">
                    <input type="submit" value="update">
                </form>
            </td>
            <td>
                <form action="/deleteSingleItem">
                    <input type="hidden" name="itemID" value="${item.getItemID()}">
                    <input type="submit" value="Delete Item">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>