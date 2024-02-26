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
        <th>Type</th>
        <th>Location</th>
        <th>Add Item</th>
        <th>Delete Restaurant</th>
        <th>Delete Item</th>
    </tr>
    <c:forEach var="restaurant" items="${restaurants}">
        <tr>
            <td><c:out value="${restaurant.getName()}"/></td>
            <td><c:out value="${restaurant.getType()}"/></td>
            <td><c:out value="${restaurant.getLocation()}"/></td>
            <td>
                <form action="/addItems">
                    <input type="hidden" name="restaurantId" value="${restaurant.getRestaurantID()}">
                    <input type="submit" value="Add">
                </form>
            </td>
            <td>
                <form action="/DeleteRestaurant">
                    <input type="hidden" name="restaurantId" value="${restaurant.getRestaurantID()}">
                    <input type="submit" value="Delete Restaurant">
                </form>
            </td>
            <td>
                <form action="/DeleteItem">
                    <input type="hidden" name="restaurantId" value="${restaurant.getRestaurantID()}">
                    <input type="submit" value="View Items">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>