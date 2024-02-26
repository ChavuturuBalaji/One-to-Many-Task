<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

</head>
<body>
<!DOCTYPE html>

<style>
    .button-container {
        text-align: center;
    }

    .button-container form {
        display: inline-block;
        margin: 0 10px;
    }
</style>
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
</div>

<form:form modelAttribute="itemModel" action="addToList">
    <table>
        <tr>
            <td>Restaurant ID</td>
            <td><form:input path="restaurantEntity" readonly="true" value="${param.restaurantId}"/></td>
        </tr>
        <tr>
            <td>Item Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><form:input path="category"/></td>
        </tr>
        <tr>
            <td>Cuisine</td>
            <td><form:input path="cuisine"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
